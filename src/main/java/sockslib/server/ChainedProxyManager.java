package sockslib.server;

import sockslib.server.manager.User;

public interface ChainedProxyManager {
    ChainedProxy getChainedProxy(User user);
}
