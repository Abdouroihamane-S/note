public class Module {

    private String code;
    private String libelle;
    private double coefficient;

    public Module(String code, String libelle, double coefficient) {

        if (code == null || code.isBlank())
            throw new IllegalArgumentException("Code invalide");

        if (libelle == null || libelle.isBlank())
            throw new IllegalArgumentException("Libelle invalide");

        if (coefficient <= 0)
            throw new IllegalArgumentException("Coefficient doit etre > 0");

        this.code = code;
        this.libelle = libelle;
        this.coefficient = coefficient;
    }

    public Module(String code, String libelle) {
        this(code, libelle, 1.0);
    }

    public String getCode() {
        return code;
    }

    public double getCoefficient() {
        return coefficient;
    }

    @Override
    public String toString() {
        return "Module{code=" + code + ", libelle=" + libelle +
                ", coefficient=" + coefficient + "}";
    }
}