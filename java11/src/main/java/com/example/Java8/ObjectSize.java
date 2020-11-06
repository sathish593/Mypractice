package com.example.Java8;


import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarFile;

 class ObjectSize1 {
    private static Instrumentation instrumentation;

    public static void premain(String args, Instrumentation inst) {
        instrumentation = inst;
    }

    public static long getObjectSize(Object o) {
        return instrumentation.getObjectSize(o);
    }
}

public class ObjectSize{
    public static void main(String[] args) {
	ObjectSize1.premain(args, new Instrumentation);
	System.out.println(ObjectSize1.getObjectSize(new HashMap<>()));
    }
}