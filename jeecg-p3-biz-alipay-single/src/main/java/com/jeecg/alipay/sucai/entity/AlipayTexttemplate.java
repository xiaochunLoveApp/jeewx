package com.jeecg.alipay.sucai.entity;

import java.io.Serializable;
import java.util.Date;

import com.jeecg.alipay.util.SystemUtil;

/**
 * 描述：</b>QywxTexttemplate:文本模板<br>
 * 实体定义规则
 * 字段不允许存在基本类型，必须都是包装类型(因为基本类型有默认值)
 * 基本数据类型  包装类 byte Byte boolean Boolean short Short char Character int Integer long Long float Float double  Double 
 * @author zhoujf
 * @since：2016年03月24日 15时52分18秒 星期四 
 * @version:1.0
 */
public class AlipayTexttemplate implements Serializable{
	private static final long serialVersionUID = 1L;
	
		return SystemUtil.getOnlieAlipayAccountId();
	@Override
	public String toString() {
		return "QywxTexttemplate [id=" + id + ", templateName=" + templateName
				+ ", templateContent=" + templateContent + ", accountid="
				+ accountid + ", createName=" + createName + ", createBy="
				+ createBy + ", createDate=" + createDate + ", updateName="
				+ updateName + ", updateBy=" + updateBy + ", updateDate="
				+ updateDate + "]";
	}
	
}
