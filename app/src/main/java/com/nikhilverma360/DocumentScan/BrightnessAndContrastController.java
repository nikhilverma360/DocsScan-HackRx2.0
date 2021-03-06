/*
 * Copyright (C) 2021 Dev Sebastian
 * This file is part of WonderScan <https://github.com/devsebastian/WonderScan>.
 *
 * WonderScan is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * WonderScan is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with WonderScan.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.nikhilverma360.DocumentScan;

import org.opencv.core.Mat;

public class BrightnessAndContrastController {
    double brightness, contrast;

    public BrightnessAndContrastController(double brightness, double contrast) {
        this.brightness = brightness;
        this.contrast = contrast;
    }

    public Mat setBrightness(Mat sourceMat, double value) {
        brightness = value;
        return process(sourceMat);
    }

    public Mat setContrast(Mat sourceMat, double value) {
        contrast = value;
        return process(sourceMat);
    }

    private Mat process(Mat sourceMat) {
        Mat mat = new Mat();
        sourceMat.copyTo(mat);
        mat.convertTo(mat, -1, contrast, brightness);
        return mat;
    }
}
