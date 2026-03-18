public class VectorOperations {
    public static void main(String[] args) {
        try {
            VectorClass v1 = new VectorClass(new double[]{1.0, 2.0});
            VectorClass v2 = new VectorClass(new double[]{3.0, 4.0});
            VectorClass v3 = new VectorClass(new double[]{5.0, 6.0});

            System.out.println("v1: " + v1);
            System.out.println("v2: " + v2);
            System.out.println("v3: " + v3);

            VectorClass sum = v1.add(v2);
            System.out.println("v1 + v2: " + sum);

            VectorClass sum2 = v1.add(v3);
            System.out.println("v1 + v3: " + sum2);

            VectorClass diff = v1.substract(v2);
            System.out.println("v1 - v2: " + diff);

            double dotProduct = v1.dotProduct(v2);
            System.out.println("v1 . v2: " + dotProduct);

            // 3D
            VectorClass v4_3d = new VectorClass(new double[]{7.0, 8.0, 9.0});
            VectorClass v5_3d = new VectorClass(new double[]{10.0, 11.0, 12.0});

            System.out.println("v4_3d + v5_3d: " + v4_3d.add(v5_3d));
            System.out.println("v4_3d - v5_3d: " + v4_3d.substract(v5_3d));
            System.out.println("v4_3d . v5_3d: " + v4_3d.dotProduct(v5_3d));

        } catch (InvalidVectorException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Invalid case
        try {
            VectorClass invalidVector = new VectorClass(new double[]{4.4});
        } catch (InvalidVectorException e) {
            System.err.println("Error creating invalid vector: " + e.getMessage());
        }
    }
}