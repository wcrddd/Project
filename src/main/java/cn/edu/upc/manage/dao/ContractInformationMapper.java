package cn.edu.upc.manage.dao;

import cn.edu.upc.manage.model.ContractInformation;
import cn.edu.upc.manage.model.ContractWithProjectName;

import java.util.List;

public interface ContractInformationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_information
     *
     * @mbg.generated Sun Jun 14 21:43:59 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_information
     *
     * @mbg.generated Sun Jun 14 21:43:59 CST 2020
     */
    int insert(ContractInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_information
     *
     * @mbg.generated Sun Jun 14 21:43:59 CST 2020
     */
    int insertSelective(ContractInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_information
     *
     * @mbg.generated Sun Jun 14 21:43:59 CST 2020
     */
    ContractInformation selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_information
     *
     * @mbg.generated Sun Jun 14 21:43:59 CST 2020
     */
    int updateByPrimaryKeySelective(ContractInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_information
     *
     * @mbg.generated Sun Jun 14 21:43:59 CST 2020
     */
    int updateByPrimaryKey(ContractInformation record);

    List<ContractInformation> getAllContractInformation();

    List<ContractInformation> getContractByProjectId(int projectId);

    int selectLastInsert();

    List<ContractInformation> getContractByTenderId(int tenderId);

    List<ContractWithProjectName> getAllContractWithProjectName();

}