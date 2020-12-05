package form;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import com.sun.istack.NotNull;



@Component
public class InquiryForm {
	/*
	 *ユーザーID
	 */
	@Id
	@Column(name = "{INQUIRY_ID}")
	@NotNull
	private int inquiryId;

	/*
	 *問い合わせ内容項目
	 */
	@Column(name = "{INQURY_TYPE}")
	@NotNull

	private String inquiryType;

	/*
	 *ユーザー　お名前
	 */
	@Size(min = 1,max = 60,message = "⚠お名前を入力してください")
	@Column(name = "{INQURY_USER}")
	@NotNull
	private String inquiryUser;

	/*
	 *ユーザー　メールアドレス
	 */
	@Email(message = "⚠メールアドレスの形式で入力してください。")
	@Column(name = "{INQURY_USER_MAIL}")
	@NotNull
	private String inquiryUserMail;

	/*
	 *問い合わせ内容入力
	 */
	@Size(min = 5,max = 3000,message = "⚠お問い合わせ内容は5文字以上3000文字以内で入力してください。")
	@Column(name = "{INQURY_INFO}")
	@NotNull
	private String inquiryInfo;

	/*
	 *内容登録日時
	 */
	@Column(name = "{INQURY_TIME}")
	@NotNull
	private Timestamp inquiryTime;

	/*
	 * getter setter メソッド
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


}

