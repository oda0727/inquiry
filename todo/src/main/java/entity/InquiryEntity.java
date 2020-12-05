package entity;


import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="INQUIRY")
/*
 引数を持たないコンストラクタを生成
※JPAの仕様でエンティティクラスには引数のないコンストラクタが必要な為>
※JPAの仕様でエンティティクラスには引数のないコンストラクタが必要な為
*/

public class InquiryEntity {

	    @Id //エンティティの主キーを示す

	    @Column(name = "INQUIRY_ID")
	    @NotNull
	    private int inquiryId;

	    @Column(name = "INQUIRY_TYPE")
	    @NotNull
	    private String inquiryType;

	    @Column(name = "INQUIRY_USER")
	    @NotNull
	    private String inquiryUser;

	    @Column(name = "INQUIRY_USER_MAIL")
	    @NotNull
	    private String inquiryUserMail;

	    @Column(name = "INQUIRY_INFO")
	    @NotNull
	    private String inquiryInfo;

	    @Column(name = "INQUIRY_TIME")
	    @NotNull
	    private Timestamp inquiryTime;

	    /*
	     getter setter
	     */
		public int getInquiryId() {
			return inquiryId;
		}

		public void setInquiryId(int inquiryId) {
			this.inquiryId = inquiryId;
		}

		public String getInquiryType() {
			return inquiryType;
		}

		public void setInquiryType(String inquiryType) {
			this.inquiryType = inquiryType;
		}

		public String getInquiryUser() {
			return inquiryUser;
		}

		public void setInquiryUser(String inquiryUser) {
			this.inquiryUser = inquiryUser;
		}

		public String getInquiryUserMail() {
			return inquiryUserMail;
		}

		public void setInquiryUserMail(String inquiryUserMail) {
			this.inquiryUserMail = inquiryUserMail;
		}

		public String getInquiryInfo() {
			return inquiryInfo;
		}

		public void setInquiryInfo(String inquiryInfo) {
			this.inquiryInfo = inquiryInfo;
		}

		public Timestamp getInquiryTime() {
			return inquiryTime;
		}

		public void setInquiryTime(Timestamp inquiryTime) {
			this.inquiryTime = inquiryTime;
		}
		@PrePersist
		public void onPrePersist() {
			setInquiryTime(new Timestamp((new Date()).getTime()));
		}
	}
