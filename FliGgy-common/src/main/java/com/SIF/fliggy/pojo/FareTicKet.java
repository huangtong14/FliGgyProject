package com.SIF.fliggy.pojo;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 此类用于封装车票（表）的字段数据。 注释：此处的车票并不仅仅指汽车票，还包含火车票、飞机票
 * 
 * @author Administrator
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("ticket")
public class FareTicKet implements Serializable{

	private static final long serialVersionUID = -2294987532570138261L;

	@TableId(type = IdType.AUTO) // 标识主键并且自增
	private Integer vehicle_id;// 车票id

	private String vehicleName;// 车票名称
	private String departureCity;// 出发城市
	private String arrivalCity;// 到达城市
	private Date departureDate;// 出发日期
	private Date arrivalDate;// 到达日期
	private Integer vehiclePrice;// 价格
	private Integer salesVolume;// 销量
	private String commodityDetails;// 车票详情
	private Integer vehicleNumber;// 车票数量
}
