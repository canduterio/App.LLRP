package havis.llrpservice.sbc.rfc.message;

public enum MessageType {
	GET_CAPABILITIES,
	GET_CAPABILITIES_RESPONSE,
	GET_CONFIGURATION,
	GET_CONFIGURATION_RESPONSE,
	SET_CONFIGURATION,
	SET_CONFIGURATION_RESPONSE,
	RESET_CONFIGURATION,
	RESET_CONFIGURATION_RESPONSE,
	EXECUTE,
	EXECUTE_RESPONSE,
	GET_OPERATIONS,
	GET_OPERATIONS_RESPONSE,
	KEEP_ALIVE,
	CONNECTION_ATTEMPTED
}