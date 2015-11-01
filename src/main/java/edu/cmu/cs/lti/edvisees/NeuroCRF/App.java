package edu.cmu.cs.lti.edvisees.NeuroCRF;

import java.io.*;

import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

/**
 * Hello world!
 *
 * add "-Dorg.nd4j.linalg.cpu.force_native=false" to JVM argument for pure java
 */
public class App 
{
    public static void main( String[] args ) {

        INDArray nd = Nd4j.create(new float[]{1, 2}, new int[]{2});
        INDArray nd2 = Nd4j.create(new float[]{3,4},new int[]{2, 1});
        nd = nd2.mmul(nd);
        System.out.println(nd.toString());
        System.out.println( "Hello World!" );
    }
}
