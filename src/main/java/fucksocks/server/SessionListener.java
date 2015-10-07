package fucksocks.server;

import fucksocks.common.SocksException;
import fucksocks.common.methods.SocksMethod;
import fucksocks.server.msg.CommandMessage;

import java.util.concurrent.ExecutorService;

/**
 * @author Youchao Feng
 * @version 1.0
 * @date Sep 30, 2015 12:38 PM
 */
public interface SessionListener {

  void postCreate(Session session) throws SocksException;
  void beforeDoMethod(Session session, SocksMethod method) throws SocksException;
  void postDoMethod(Session session, SocksMethod method) throws SocksException;
  void beforeDoCommand(Session session, CommandMessage commandMessage) throws SocksException;
  void postDoCommand(Session session, CommandMessage commandMessage) throws SocksException;
  void beforeClose(Session session) throws SocksException;

}
