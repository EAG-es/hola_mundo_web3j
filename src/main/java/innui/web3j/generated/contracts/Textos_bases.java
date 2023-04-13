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
    public static final String BINARY = "61040161003a600b82828239805160001a60731461002d57634e487b7160e01b600052600060045260246000fd5b30600052607381538281f3fe730000000000000000000000000000000000000000301460806040526004361061004b5760003560e01c806376332c2d14610050578063c194387014610078578063fc09a9e51461008b575b600080fd5b61006361005e3660046102a8565b6100ab565b60405190151581526020015b60405180910390f35b6100636100863660046102a8565b6100c0565b61009e61009936600461030c565b6100e5565b60405161006f9190610325565b60006100b783836100c0565b90505b92915050565b6000815183511480156100b75750508051602091820120825192909101919091201490565b606060005b602081101580610117575082816020811061010757610107610373565b1a60f81b6001600160f81b031916155b61012d5761012681600161039f565b90506100ea565b60008167ffffffffffffffff81111561014857610148610205565b6040519080825280601f01601f191660200182016040528015610172576020820181803683370190505b509050600091505b6020821080156101a8575083826020811061019757610197610373565b1a60f81b6001600160f81b03191615155b156101fe578382602081106101bf576101bf610373565b1a60f81b8183815181106101d5576101d5610373565b60200101906001600160f81b031916908160001a905350816101f6816103b2565b92505061017a565b9392505050565b634e487b7160e01b600052604160045260246000fd5b600082601f83011261022c57600080fd5b813567ffffffffffffffff8082111561024757610247610205565b604051601f8301601f19908116603f0116810190828211818310171561026f5761026f610205565b8160405283815286602085880101111561028857600080fd5b836020870160208301376000602085830101528094505050505092915050565b600080604083850312156102bb57600080fd5b823567ffffffffffffffff808211156102d357600080fd5b6102df8683870161021b565b935060208501359150808211156102f557600080fd5b506103028582860161021b565b9150509250929050565b60006020828403121561031e57600080fd5b5035919050565b600060208083528351808285015260005b8181101561035257858101830151858201604001528201610336565b506000604082860101526040601f19601f8301168501019250505092915050565b634e487b7160e01b600052603260045260246000fd5b634e487b7160e01b600052601160045260246000fd5b808201808211156100ba576100ba610389565b6000600182016103c4576103c4610389565b506001019056fea2646970667358221220da90f1b7ed7d5a53a308ce98e49606ac93af0bb0a815f99c79245a6c3ec5f96164736f6c63430008110033";

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
