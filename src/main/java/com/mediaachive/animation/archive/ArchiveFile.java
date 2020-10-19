package com.mediaachive.animation.archive;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class ArchiveFile {
	private static final long serialVersionUID = 1L;
	private int i_arc; //등록한 작품의 키값
	private List<MultipartFile> arc_source; //파일을 여러개 올릴수 있는 기능 1,
	
	public int getI_arc() {
		return i_arc;
	}

	public void setI_arc(int i_arc) {
		this.i_arc = i_arc;
	}

	public List<MultipartFile> arc_source() {
		return arc_source;
	}
	public void setArc_pic(List<MultipartFile> arc_source) {
		this.arc_source = arc_source;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
