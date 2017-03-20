package ch.heigvd.res.stpatrick;

/**
 * This class is responsible for providing different types of Stream Processors.
 * 
 * @author Olivier Liechti
 */
public class StreamProcessorsFactory implements IStreamProcessorsFactory {

  @Override
  public IStreamProcessor getProcessor() {
    return new BasicStreamProcessor();
  }

  @Override
  public IStreamProcessor getProcessor(String processorName) throws UnknownNameException {
    //throw new UnknownNameException("The factory does not know any processor called " + processorName);
    IStreamProcessor iprocessor = new BasicStreamProcessor();
     String[] delimiters = {"E", "e"};
      /*Result extended*/
      String tokens = new String();
      /*There is at least one separator*/
      for (String delim : delimiters) {
         int index = processorName.indexOf(delim);
         if (index != -1) {
            tokens = processorName.substring(index);   
            processorName = processorName.concat(tokens);
         }
      }
      return iprocessor;
  }

}
