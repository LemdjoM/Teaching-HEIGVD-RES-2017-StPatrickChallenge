package ch.heigvd.res.stpatrick;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * 
 * @author Olivier Liechti
 */
public class Application {

  IStreamProcessorsFactory processorsFactory = new StreamProcessorsFactory();
  
  public IStreamProcessorsFactory getStreamProcessorsFactory() {
    return processorsFactory;
  }
  public void process(Reader in, Writer out) throws IOException{
      BufferedReader br = new BufferedReader(in);
      BufferedWriter bw = new BufferedWriter(out);
      int c = br.read();
      while (c != -1) {
         c = br.read();
         out.write(c);
      }
      in.close();
      bw.flush();
      out.close(); 
  }

}
