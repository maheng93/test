public enum CommonEnum {

    ENABLE("IS_ENABLE","是否启用",1,"启用"),

    DISABLE("IS_ENABLE","是否启用",0,"禁用"),

    IS_DELETE("IS_DEL","是否删除",1,"已删除"),

    NOT_DElETE("IS_DEL","是否删除",0,"未删除"),

    DICT_CODE_BANK_REGION("DICT_CODE","字典代码","BANK_REGION","区域分类");

    private String codeType;
    private String codeName;
    private String codeString;
    private Integer codeInt;
    private String value;

    private CommonEnum(String codeType, String codeName, String codeString, String value){
        this.codeType = codeType;
        this.codeName = codeName;
        this.codeString = codeString;
        this.value = value;
    }

    private CommonEnum(String codeType, String codeName, Integer codeInt, String value){
        this.codeType = codeType;
        this.codeName = codeName;
        this.codeInt = codeInt;
        this.value = value;
    }

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getCodeString() {
        return codeString;
    }

    public void setCodeString(String code) {
        this.codeString = code;
    }

    public Integer getCodeInt() {
        return codeInt;
    }

    public void setCodeInt(Integer codeInt) {
        this.codeInt = codeInt;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
	22222	
	3333
	5555
	111111

}
