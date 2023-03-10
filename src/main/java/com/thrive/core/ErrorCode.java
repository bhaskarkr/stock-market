package com.thrive.core;

public enum ErrorCode {
    DAO_ERROR,

//    User Related Error
    USER_ID_NOT_FOUND,
    USER_NOT_SAVED,
    USER_ALREADY_EXIST,
    ONLY_ADMIN_CAN_UPDATE_PRICE,

    // Wallet Related Error
    WALLET_NOT_FOUND,
    WALLET_ALREADY_EXIST,
    WALLET_NOT_SAVED,
    WALLET_INSUFFICIENT_BALANCE,

    // Stock related error
     STOCK_NOT_SAVED,
    STOCK_DOES_NOT_EXIST,
    NOT_ENOUGH_STOCK_AVAILABLE,
    ADMIN_ARE_NOT_ALLOWED_TO_BUY_OR_SELL_STOCK,
    CAN_T_SELL_MORE_THAN_AVAILABLE_UNIT,

    // Timing related error
    MARKET_TIMING_NOT_CREATED,
    BUY_AND_SELL_NOT_ALLOWED_OUTSIDE_MARKET_TIMING,
    ONLY_ADMIN_CAN_UPDATE_MARKET_TIMING
    ;
}
