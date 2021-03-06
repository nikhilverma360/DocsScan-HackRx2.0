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

// C++: class TonemapDrago
//javadoc: TonemapDrago

public class TonemapDrago extends Tonemap {

    protected TonemapDrago(long addr) { super(addr); }

    // internal usage only
    public static TonemapDrago __fromPtr__(long addr) { return new TonemapDrago(addr); }

    //
    // C++:  float cv::TonemapDrago::getBias()
    //

    //javadoc: TonemapDrago::getBias()
    public  float getBias()
    {
        
        float retVal = getBias_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  float cv::TonemapDrago::getSaturation()
    //

    //javadoc: TonemapDrago::getSaturation()
    public  float getSaturation()
    {
        
        float retVal = getSaturation_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  void cv::TonemapDrago::setBias(float bias)
    //

    //javadoc: TonemapDrago::setBias(bias)
    public  void setBias(float bias)
    {
        
        setBias_0(nativeObj, bias);
        
        return;
    }


    //
    // C++:  void cv::TonemapDrago::setSaturation(float saturation)
    //

    //javadoc: TonemapDrago::setSaturation(saturation)
    public  void setSaturation(float saturation)
    {
        
        setSaturation_0(nativeObj, saturation);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  float cv::TonemapDrago::getBias()
    private static native float getBias_0(long nativeObj);

    // C++:  float cv::TonemapDrago::getSaturation()
    private static native float getSaturation_0(long nativeObj);

    // C++:  void cv::TonemapDrago::setBias(float bias)
    private static native void setBias_0(long nativeObj, float bias);

    // C++:  void cv::TonemapDrago::setSaturation(float saturation)
    private static native void setSaturation_0(long nativeObj, float saturation);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
