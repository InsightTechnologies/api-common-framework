package com.miracle.exception;

public interface ReleaseErrorCode {
	String INVALID_FILTER_TYPE = "MSB.REL.IFT.000";
	String UNABLE_TO_ORDER_FEATURE_LIST = "MSB.REL.UOF.000";
	String UNABLE_TO_GET_STORIES_FROM_FEATURE = "MSB.REL.UGS.000";
	String UNABLE_TO_ESTIMATE_EFFORT = "MSB.REL.UEF.000";
	String UNABLE_TO_GET_FEATURES = "MSB.REL.UGF.000";
	
	String RELEASE_CONTROLLER_UNKNOWN_EXCEPTION = "MSB.REL.UN.000";
}
