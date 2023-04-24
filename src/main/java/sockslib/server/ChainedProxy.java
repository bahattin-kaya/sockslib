package sockslib.server;

import sockslib.common.UsernamePasswordCredentials;

import java.net.InetSocketAddress;

public interface ChainedProxy {

    InetSocketAddress getChainedProxyAddress();

    UsernamePasswordCredentials getCredentials();
}
