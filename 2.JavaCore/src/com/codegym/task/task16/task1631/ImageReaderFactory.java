package com.codegym.task.task16.task1631;


import com.codegym.task.task16.task1631.common.*;

public class ImageReaderFactory {


    public static ImageReader getImageReader(ImageTypes imageType){

        if(imageType==null){
            throw new IllegalArgumentException();
        }
        switch (imageType){
            case JPG:
                return new JpgReader();
            case BMP:
                return new BmpReader();
            case PNG:
                return new PngReader();
            default:
                throw new IllegalArgumentException();
        }
    }
}
