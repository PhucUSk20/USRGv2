package com.example.face_detection;

import org.opencv.core.Mat;
import org.tensorflow.lite.Interpreter;

import java.io.File;

public class FaceNet {
    private Interpreter interpreter;

    public FaceNet(String modelPath) {
        try {
            Interpreter.Options options = new Interpreter.Options();
            interpreter = new Interpreter(new File(modelPath), options);
        } catch (Exception e) {
            throw new RuntimeException("Error initializing FaceNet with model: " + e.getMessage());
        }
    }


}

