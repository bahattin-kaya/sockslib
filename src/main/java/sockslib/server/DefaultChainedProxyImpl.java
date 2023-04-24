package sockslib.server;

import sockslib.common.UsernamePasswordCredentials;

import java.net.InetSocketAddress;

public class DefaultChainedProxyImpl implements ChainedProxy {

    private final InetSocketAddress chainedProxyAddress;
    private final UsernamePasswordCredentials credentials;

    public DefaultChainedProxyImpl(InetSocketAddress chainedProxyAddress, UsernamePasswordCredentials credentials) {
        this.chainedProxyAddress = chainedProxyAddress;
        this.credentials = credentials;
    }

    @Override
    public InetSocketAddress getChainedProxyAddress() {
        return chainedProxyAddress;
    }

    @Override
    public UsernamePasswordCredentials getCredentials() {
        return credentials;
    }
}
