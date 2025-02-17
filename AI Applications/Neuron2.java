//ex 8.2a; java perceptron single neuron example 2 with training

import java.util.Random;
public class Neuron2 {
  double w[];
  double threshold;

  public int Output(double x[]) {
    double sum = 0.0;
    for(int i = 0;i < x.length;i++) {
      sum += w[i] * x[i];
    }
    if(sum > threshold)
      return 1;
    else
      return 0;
  }
  public void Train(double[][] x, int[] y,double threshold,double learnrate,int epoch)
  {
    this.threshold = threshold;
    int N = x[0].length;
    w = new double[N];
    Random r = new Random();

    //initalize all weights
    for(int i = 0; i < N;i++) {
      w[i] = r.nextDouble();
    }
    // do training
    for(int i = 0; i < epoch; i++){
      int totalError = 0;
      for(int j =0;j < y.length;j++){
        //calculate output and error
        int output = Output(x[j]);
        int error = y[j] - output;
        totalError += error;
        // update weights
        for(int k = 0; k < N;k++){
          double delta = learnrate * x[j][k] * error;
          w[k] += delta;
        }
      }
      if(totalError == 0)
        break;
    }
  }
}
