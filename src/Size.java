public enum Size {

    SMALL(32, 36, "Pequeno", 'S'),
    MEDIUM(37, 44, "Médio", 'M'),
    LARGE(45, 52, "Grande", 'L');

    private final String description;
    private final int minValue;
    private final int maxValue;
    private final char code;

    /**
     *
     * @param minValue Valor mínimo do tamanho
     * @param maxValue Valor máximo do tamanho
     * @param description Descrição do tamanho
     * @param code Código de um único caracter do tamanho
     */
    private Size(int minValue, int maxValue, String description, char code){
        this.description = description;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.code = code;
    }

    /**
     * Representa o objeto
     * @return Descrição do objeto
     */
    @Override
    public String toString(){
        return this.description;
    }

    /**
     * @return Descrição do tamanho
     */
    public String getDescription(){
        return description;
    }

    /**
     * @return Valor mínimo
     */
    public int getMinValue(){
        return minValue;
    }

    /**
     * @return Valor máximo
     */
    public int getMaxValue(){
        return maxValue;
    }

    /**
     * @return Caracter único do tamanho
     */
    public char getCode(){
        return code;
    }

}
