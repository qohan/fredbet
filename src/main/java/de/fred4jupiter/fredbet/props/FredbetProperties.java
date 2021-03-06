package de.fred4jupiter.fredbet.props;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Contains all configuration properties for FredBet application.
 * 
 * @author michael
 *
 */
@ConfigurationProperties(prefix = FredbetProperties.PROPS_PREFIX)
public class FredbetProperties {

	public static final String PROPS_PREFIX = "fredbet";

	private String databaseUrl;

	private String databaseUsername;

	private String databasePassword;

	public static final DatabaseType DEFAULT_DB_TYPE = DatabaseType.H2;

	private DatabaseType databaseType = DEFAULT_DB_TYPE;

	/**
	 * Image size of the generated thumbnails.
	 */
	private int thumbnailSize;

	/**
	 * Image size for the uploaded images.
	 */
	private int imageSize;

	/**
	 * Selection of possible image storage locations.
	 */
	private ImageLocation imageLocation;

	/**
	 * Path in file system to store images in case of image location is set to
	 * 'file-system'
	 */
	private String imageFileSystemBaseFolder;

	/**
	 * The AWS S3 bucket name to use to store images in.
	 */
	private String awsS3bucketName;

	public String getDatabaseUrl() {
		return databaseUrl;
	}

	public void setDatabaseUrl(String databaseUrl) {
		this.databaseUrl = databaseUrl;
	}

	public String getDatabaseUsername() {
		return databaseUsername;
	}

	public void setDatabaseUsername(String databaseUsername) {
		this.databaseUsername = databaseUsername;
	}

	public String getDatabasePassword() {
		return databasePassword;
	}

	public void setDatabasePassword(String databasePassword) {
		this.databasePassword = databasePassword;
	}

	public int getThumbnailSize() {
		return thumbnailSize;
	}

	public void setThumbnailSize(int thumbnailSize) {
		this.thumbnailSize = thumbnailSize;
	}

	public int getImageSize() {
		return imageSize;
	}

	public void setImageSize(int imageSize) {
		this.imageSize = imageSize;
	}

	public DatabaseType getDatabaseType() {
		return databaseType;
	}

	public void setDatabaseType(DatabaseType databaseType) {
		this.databaseType = databaseType;
	}

	public ImageLocation getImageLocation() {
		return imageLocation;
	}

	public void setImageLocation(ImageLocation imageLocation) {
		this.imageLocation = imageLocation;
	}

	public String getAwsS3bucketName() {
		return awsS3bucketName;
	}

	public void setAwsS3bucketName(String awsS3bucketName) {
		this.awsS3bucketName = awsS3bucketName;
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE);
		builder.append("databaseUrl", databaseUrl);
		builder.append("databasePassword", databasePassword != null ? "********" : "null");
		builder.append("databaseType", databaseType);
		builder.append("thumbnailSize", thumbnailSize);
		builder.append("imageSize", imageSize);
		builder.append("imageLocation", imageLocation);

		builder.append("imageFileSystemBaseFolder", imageFileSystemBaseFolder);
		builder.append("awsS3bucketName", awsS3bucketName);
		return builder.toString();
	}

	public String getImageFileSystemBaseFolder() {
		return imageFileSystemBaseFolder;
	}

	public void setImageFileSystemBaseFolder(String imageFileSystemBaseFolder) {
		this.imageFileSystemBaseFolder = imageFileSystemBaseFolder;
	}
}
