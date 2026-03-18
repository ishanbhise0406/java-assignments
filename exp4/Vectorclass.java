
public class VectorClass {
    double[] comps;

    public VectorClass(double[] arr) throws InvalidVectorException {
        if (arr == null || arr.length == 0)
            throw new InvalidVectorException("Invalid Vector");

        // FIXED condition
        if (arr.length != 2 && arr.length != 3)
            throw new InvalidVectorException("Only 2D or 3D supported");

        comps = arr.clone();
    }

    public VectorClass add(VectorClass v) throws InvalidVectorException {
        checkDimension(v);
        double results[] = new double[comps.length];

        for (int i = 0; i < comps.length; i++) // FIXED
            results[i] = comps[i] + v.comps[i];

        return new VectorClass(results);
    }

    public VectorClass substract(VectorClass v) throws InvalidVectorException {
        checkDimension(v);
        double results[] = new double[comps.length];

        for (int i = 0; i < comps.length; i++) // FIXED
            results[i] = comps[i] - v.comps[i];

        return new VectorClass(results);
    }

    public double dotProduct(VectorClass v) throws InvalidVectorException {
        checkDimension(v);
        double result = 0;

        for (int i = 0; i < comps.length; i++) // FIXED
            result += comps[i] * v.comps[i]; // FIXED

        return result;
    }

    void checkDimension(VectorClass v) throws InvalidVectorException {
        // FIXED comparison
        if (comps.length != v.comps.length)
            throw new InvalidVectorException("Incompatible Vector Dimension");
    }

    public void print() {
        if (comps.length == 2)
            System.out.print("Vector(" + comps[0] + ", " + comps[1] + ")");
        else
            System.out.print("Vector(" + comps[0] + ", " + comps[1] + ", " + comps[2] + ")");
    }

    @Override
    public String toString() {
        if (comps.length == 2)
            return "Vector(" + comps[0] + ", " + comps[1] + ")";
        else
            return "Vector(" + comps[0] + ", " + comps[1] + ", " + comps[2] + ")";
    }
}
