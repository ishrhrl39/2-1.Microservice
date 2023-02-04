package org.msa.item.dto;

import lombok.Data;

@Data
public class ItemDTO {
	private String id;
	private String name;
	private String description;
	private long count;
	private String regDts;
	private String updDts;
}
