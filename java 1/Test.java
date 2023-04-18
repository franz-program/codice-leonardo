import java.util.List;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        double[] a = {1, 1.5};
        double[] b = {1, 4.5};
        double[] c = {2, 1.5};
        double[] d = {2, 3.5};
        double[] e = {3, 2.5};
        double[] f = {5, 6};

        double[] center1 = {1.5, 2.75};
        double[] center2 = {4, 4.25};

        List<double[]> cluster1 = new ArrayList<double[]>();
        cluster1.add(a);
        cluster1.add(b);
        cluster1.add(c);
        cluster1.add(d);

        List<double[]> cluster2 = new ArrayList<double[]>();
        cluster2.add(e);
        cluster2.add(f);

        //print sum of distances
        System.out.println(clusterDistance(cluster1, center1) + clusterDistance(cluster2, center2));
        

    }

    private static double clusterDistance(List<double[]> cluster, double[] center){
        double sum = 0;
        for (double[] point : cluster) {
            sum += Math.pow(distance(point, center), 2);
        }
        return sum;
    }

    private static double distance(double[] a, double[] b) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += Math.pow(a[i] - b[i], 2);
        }
        return Math.sqrt(sum);
    }
}
