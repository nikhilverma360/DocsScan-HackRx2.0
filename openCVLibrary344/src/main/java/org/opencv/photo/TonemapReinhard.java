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

//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.photo;

import org.opencv.photo.Tonemap;

// C++: class TonemapReinhard
//javadoc: TonemapReinhard

public class TonemapReinhard extends Tonemap {

    protected TonemapReinhard(long addr) { super(addr); }

    // internal usage only
    public static TonemapReinhard __fromPtr__(long addr) { return new TonemapReinhard(addr); }

    //
    // C++:  float cv::TonemapReinhard::getColorAdaptation()
    //

    //javadoc: TonemapReinhard::getColorAdaptation()
    public  float getColorAdaptation()
    {
        
        float retVal = getColorAdaptation_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  float cv::TonemapReinhard::getIntensity()
    //

    //javadoc: TonemapReinhard::getIntensity()
    public  float getIntensity()
    {
        
        float retVal = getIntensity_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  float cv::TonemapReinhard::getLightAdaptation()
    //

    //javadoc: TonemapReinhard::getLightAdaptation()
    public  float getLightAdaptation()
    {
        
        float retVal = getLightAdaptation_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  void cv::TonemapReinhard::setColorAdaptation(float color_adapt)
    //

    //javadoc: TonemapReinhard::setColorAdaptation(color_adapt)
    public  void setColorAdaptation(float color_adapt)
    {
        
        setColorAdaptation_0(nativeObj, color_adapt);
        
        return;
    }


    //
    // C++:  void cv::TonemapReinhard::setIntensity(float intensity)
    //

    //javadoc: TonemapReinhard::setIntensity(intensity)
    public  void setIntensity(float intensity)
    {
        
        setIntensity_0(nativeObj, intensity);
        
        return;
    }


    //
    // C++:  void cv::TonemapReinhard::setLightAdaptation(float light_adapt)
    //

    //javadoc: TonemapReinhard::setLightAdaptation(light_adapt)
    public  void setLightAdaptation(float light_adapt)
    {
        
        setLightAdaptation_0(nativeObj, light_adapt);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  float cv::TonemapReinhard::getColorAdaptation()
    private static native float getColorAdaptation_0(long nativeObj);

    // C++:  float cv::TonemapReinhard::getIntensity()
    private static native float getIntensity_0(long nativeObj);

    // C++:  float cv::TonemapReinhard::getLightAdaptation()
    private static native float getLightAdaptation_0(long nativeObj);

    // C++:  void cv::TonemapReinhard::setColorAdaptation(float color_adapt)
    private static native void setColorAdaptation_0(long nativeObj, float color_adapt);

    // C++:  void cv::TonemapReinhard::setIntensity(float intensity)
    private static native void setIntensity_0(long nativeObj, float intensity);

    // C++:  void cv::TonemapReinhard::setLightAdaptation(float light_adapt)
    private static native void setLightAdaptation_0(long nativeObj, float light_adapt);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
