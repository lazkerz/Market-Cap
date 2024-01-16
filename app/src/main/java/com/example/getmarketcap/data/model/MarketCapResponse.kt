package com.example.getmarketcap.data.model

data class MarketCapResponse(
	val data: List<DataItem>
)

data class USD(
	val cONVERSIONTYPE: String,
	val lASTTRADEID: String,
	val oPEN24HOUR: String,
	val hIGHDAY: String,
	val lOW24HOUR: String,
	val tOPTIERVOLUME24HOUR: String,
	val tOTALVOLUME24HTO: String,
	val tOSYMBOL: String,
	val lASTMARKET: String,
	val lASTVOLUME: String,
	val cIRCULATINGSUPPLY: String,
	val lOWHOUR: String,
	val cONVERSIONSYMBOL: String,
	val mKTCAP: String,
	val lASTUPDATE: String,
	val cHANGEPCTHOUR: String,
	val tOTALVOLUME24H: String,
	val vOLUMEHOURTO: String,
	val vOLUMEHOUR: String,
	val tOPTIERVOLUME24HOURTO: String,
	val cHANGEDAY: String,
	val fLAGS: String,
	val sUPPLY: String,
	val mEDIAN: Any,
	val tYPE: String,
	val iMAGEURL: String,
	val vOLUMEDAY: String,
	val vOLUME24HOUR: String,
	val mARKET: String,
	val pRICE: String,
	val cHANGEPCTDAY: String,
	val tOTALTOPTIERVOLUME24H: String,
	val cONVERSIONLASTUPDATE: String,
	val fROMSYMBOL: String,
	val lASTVOLUMETO: String,
	val cIRCULATINGSUPPLYMKTCAP: String,
	val cHANGEPCT24HOUR: String,
	val oPENDAY: String,
	val tOTALTOPTIERVOLUME24HTO: String,
	val vOLUMEDAYTO: String,
	val oPENHOUR: String,
	val cHANGE24HOUR: String,
	val cHANGEHOUR: String,
	val hIGH24HOUR: String,
	val vOLUME24HOURTO: String,
	val hIGHHOUR: String,
	val lOWDAY: String,
	val mKTCAPPENALTY: String
)

data class RAW(
	val uSD: USD
)

data class Rating(
	val weiss: Weiss
)

data class DISPLAY(
	val uSD: USD
)

data class Weiss(
	val rating: String,
	val technologyAdoptionRating: String,
	val marketPerformanceRating: String
)

data class DataItem(
	val dISPLAY: DISPLAY,
	val rAW: RAW,
	val coinInfo: CoinInfo
)

data class CoinInfo(
	val internal: String,
	val rating: Rating,
	val blockTime: Any,
	val imageUrl: String,
	val maxSupply: Any,
	val documentType: String,
	val algorithm: String,
	val url: String,
	val name: String,
	val type: Int,
	val proofType: String,
	val netHashesPerSecond: Any,
	val assetLaunchDate: String,
	val fullName: String,
	val id: String,
	val blockNumber: Int,
	val blockReward: Any
)

