package com.aqhi.assistant.base.bean.bo.dao

import javax.persistence.*

/**
 * @author aqhi
 * @date 2018/3/3 .
 * @version 1.0.0
 */

@Entity
@Table(name = "university")
class University{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = -1

    /**
     * 大学编号
     */
    var number: String = ""

    /**
     * 大学名称
     */
    var name: String = ""
    /**
     * 大学地址
     */
    var address: String = ""


}