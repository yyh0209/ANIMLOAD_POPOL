package com.mediaachive.animation.archive;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class ArchiveFile {
	private static final long serialVersionUID = 1L;
	private int i_arc;
	private List<MultipartFile> arc_pic; 
	
	public int getI_arc() {
		return i_arc;
	}

	public void setI_arc(int i_arc) {
		this.i_arc = i_arc;
	}

	public List<MultipartFile> getArc_pic() {
		return arc_pic;
	}
	public void setArc_pic(List<MultipartFile> arc_pic) {
		this.arc_pic = arc_pic;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
