package cn.edu.upc.manage.vo;

import cn.edu.upc.manage.model.Modal;

/**
 * @author 董志涵
 */
public class ModalProjectName extends Modal {
    private String projectName;

    private String contractName;

    private String contractMoney;

    private int state;

    public String getProjectName(){return projectName;}

    public void setProjectName(String projectName){this.projectName=projectName;}

    public String getContractName(){return contractName;}

    public void setContractName(String contractName){this.contractName=contractName;}

    public int getStat(){return state;}

    public String getContractMoney(){return contractMoney;}

    public void setContractMoney(String contractMoney){this.contractMoney=contractMoney;}

    public void setState(int state){this.state=state;}
}
