package innui.web3j.generated.contracts;

import java.math.BigInteger;
import java.util.Arrays;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.9.4.
 */
@SuppressWarnings("rawtypes")
public class Textos_bases extends Contract {
    public static final String BINARY = "61041f61003a600b82828239805160001a60731461002d57634e487b7160e01b600052600060045260246000fd5b30600052607381538281f3fe730000000000000000000000000000000000000000301460806040526004361061004b5760003560e01c806376332c2d14610050578063c194387014610078578063fc09a9e51461008b575b600080fd5b61006361005e3660046102c6565b6100ab565b60405190151581526020015b60405180910390f35b6100636100863660046102c6565b6100c0565b61009e61009936600461032a565b6100e5565b60405161006f9190610343565b60006100b783836100c0565b90505b92915050565b6000815183511480156100b75750508051602091820120825192909101919091201490565b606060005b602081101580610117575082816020811061010757610107610391565b1a60f81b6001600160f81b031916155b61012d576101268160016103bd565b90506100ea565b8060000361014b575050604080516020810190915260008152919050565b60008167ffffffffffffffff81111561016657610166610223565b6040519080825280601f01601f191660200182016040528015610190576020820181803683370190505b509050600091505b6020821080156101c657508382602081106101b5576101b5610391565b1a60f81b6001600160f81b03191615155b1561021c578382602081106101dd576101dd610391565b1a60f81b8183815181106101f3576101f3610391565b60200101906001600160f81b031916908160001a90535081610214816103d0565b925050610198565b9392505050565b634e487b7160e01b600052604160045260246000fd5b600082601f83011261024a57600080fd5b813567ffffffffffffffff8082111561026557610265610223565b604051601f8301601f19908116603f0116810190828211818310171561028d5761028d610223565b816040528381528660208588010111156102a657600080fd5b836020870160208301376000602085830101528094505050505092915050565b600080604083850312156102d957600080fd5b823567ffffffffffffffff808211156102f157600080fd5b6102fd86838701610239565b9350602085013591508082111561031357600080fd5b5061032085828601610239565b9150509250929050565b60006020828403121561033c57600080fd5b5035919050565b600060208083528351808285015260005b8181101561037057858101830151858201604001528201610354565b506000604082860101526040601f19601f8301168501019250505092915050565b634e487b7160e01b600052603260045260246000fd5b634e487b7160e01b600052601160045260246000fd5b808201808211156100ba576100ba6103a7565b6000600182016103e2576103e26103a7565b506001019056fea26469706673582212202723cdd75a910d5e957b021ba17df539363b93ce16d6bc23bd50a1f8af2eebe564736f6c63430008110033";

    public static final String FUNC_CONVERTIR_BYTES32_A_STRING = "convertir_bytes32_a_string";

    public static final String FUNC_SER_IGUAL_BYTES = "ser_igual_bytes";

    public static final String FUNC_SER_IGUAL_STRING = "ser_igual_string";

    @Deprecated
    protected Textos_bases(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Textos_bases(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Textos_bases(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Textos_bases(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<String> convertir_bytes32_a_string(byte[] bytex32) {
        final Function function = new Function(FUNC_CONVERTIR_BYTES32_A_STRING, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(bytex32)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<Boolean> ser_igual_bytes(byte[] bytex_1, byte[] bytex_2) {
        final Function function = new Function(FUNC_SER_IGUAL_BYTES, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicBytes(bytex_1), 
                new org.web3j.abi.datatypes.DynamicBytes(bytex_2)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<Boolean> ser_igual_string(String tex_1, String tex_2) {
        final Function function = new Function(FUNC_SER_IGUAL_STRING, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(tex_1), 
                new org.web3j.abi.datatypes.Utf8String(tex_2)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    @Deprecated
    public static Textos_bases load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Textos_bases(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Textos_bases load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Textos_bases(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Textos_bases load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Textos_bases(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Textos_bases load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Textos_bases(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Textos_bases> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Textos_bases.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Textos_bases> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Textos_bases.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<Textos_bases> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Textos_bases.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Textos_bases> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Textos_bases.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
