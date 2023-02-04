package org.msa.item.domain;

import lombok.Data;

@Data
public class Item {
	private String id;
	private String name;
	private String description;
	private long count;
	private String regDts;
	private String updDts;
}
