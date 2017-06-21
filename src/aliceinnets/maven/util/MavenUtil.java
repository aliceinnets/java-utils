package aliceinnets.maven.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;

public class MavenUtil {
	
	public static void main(String[] args) {
		System.out.println(getModel().getArtifactId());
		System.out.println(getModel().getGroupId());
		System.out.println(getModel().getVersion());
	}
	
	public final static Model getModel() {
		try {
			return new MavenXpp3Reader().read(new FileReader(System.getProperty("user.dir")+File.separator+"pom.xml"));
		} catch (IOException | XmlPullParserException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
}
