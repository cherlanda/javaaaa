package com.willypt;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RFileOutputStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class RClient {
  private RConnection rConnection;

  public RClient() {
    try {
      if (rConnection == null) {
        rConnection = new RConnection();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public REXP eval(String query) {
    REXP result = null;
    try {
      result = rConnection.parseAndEval(query);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return result;
  }

  public void saveToServer(String src_filepath, String dest_filename) {
    byte[] b = new byte[8192];

    try {
      BufferedInputStream client_stream =
          new BufferedInputStream(new FileInputStream(new File(src_filepath)));
      RFileOutputStream server_stream = rConnection.createFile(dest_filename);

      /* typical java IO stuff */
      int c = client_stream.read(b);
      while (c >= 0) {
        server_stream.write(b, 0, c);
        c = client_stream.read(b);
      }
      server_stream.close();
      client_stream.close();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void close() {
    try {
      rConnection.close();
    } catch (Exception e) {
      e.getStackTrace();
    } finally {
      rConnection = null;
    }
  }
}
