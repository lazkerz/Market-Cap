package com.example.getmarketcap.data.model

import com.google.gson.annotations.SerializedName
import io.realm.kotlin.types.RealmList
import io.realm.kotlin.types.RealmObject

open class MarketCapResponse(

	@field:SerializedName("Type")
	val type: Int? = null,

	@field:SerializedName("Message")
	val message: String? = null,

	@field:SerializedName("MetaData")
	val metaData: MetaData? = null,

	@field:SerializedName("Data")
	val data: RealmList<DataItem>,

	@field:SerializedName("SponsoredData")
	val sponsoredData: RealmList<Any>
) : RealmObject

open class DataItem(

	@field:SerializedName("DISPLAY")
	val dISPLAY: DISPLAY,

	@field:SerializedName("RAW")
	val rAW: RAW,

	@field:SerializedName("CoinInfo")
	val coinInfo: CoinInfo
) : RealmObject

open class USD(

	@field:SerializedName("CONVERSIONTYPE")
	val cONVERSIONTYPE: String,

	@field:SerializedName("LASTTRADEID")
	val lASTTRADEID: String,

	@field:SerializedName("OPEN24HOUR")
	val oPEN24HOUR: String,

	@field:SerializedName("HIGHDAY")
	val hIGHDAY: String,

	@field:SerializedName("LOW24HOUR")
	val lOW24HOUR: String,

	@field:SerializedName("TOPTIERVOLUME24HOUR")
	val tOPTIERVOLUME24HOUR: String,

	@field:SerializedName("TOTALVOLUME24HTO")
	val tOTALVOLUME24HTO: String,

	@field:SerializedName("TOSYMBOL")
	val tOSYMBOL: String,

	@field:SerializedName("LASTMARKET")
	val lASTMARKET: String,

	@field:SerializedName("LASTVOLUME")
	val lASTVOLUME: String,

	@field:SerializedName("CIRCULATINGSUPPLY")
	val cIRCULATINGSUPPLY: String,

	@field:SerializedName("LOWHOUR")
	val lOWHOUR: String,

	@field:SerializedName("CONVERSIONSYMBOL")
	val cONVERSIONSYMBOL: String,

	@field:SerializedName("MKTCAP")
	val mKTCAP: String,

	@field:SerializedName("LASTUPDATE")
	val lASTUPDATE: String,

	@field:SerializedName("CHANGEPCTHOUR")
	val cHANGEPCTHOUR: String,

	@field:SerializedName("TOTALVOLUME24H")
	val tOTALVOLUME24H: String,

	@field:SerializedName("VOLUMEHOURTO")
	val vOLUMEHOURTO: String,

	@field:SerializedName("VOLUMEHOUR")
	val vOLUMEHOUR: String,

	@field:SerializedName("TOPTIERVOLUME24HOURTO")
	val tOPTIERVOLUME24HOURTO: String,

	@field:SerializedName("CHANGEDAY")
	val cHANGEDAY: String,

	@field:SerializedName("FLAGS")
	val fLAGS: String,

	@field:SerializedName("SUPPLY")
	val sUPPLY: String,

	@field:SerializedName("MEDIAN")
	val mEDIAN: Any,

	@field:SerializedName("TYPE")
	val tYPE: String,

	@field:SerializedName("IMAGEURL")
	val iMAGEURL: String,

	@field:SerializedName("VOLUMEDAY")
	val vOLUMEDAY: String,

	@field:SerializedName("VOLUME24HOUR")
	val vOLUME24HOUR: String,

	@field:SerializedName("MARKET")
	val mARKET: String,

	@field:SerializedName("PRICE")
	val pRICE: String,

	@field:SerializedName("CHANGEPCTDAY")
	val cHANGEPCTDAY: String,

	@field:SerializedName("TOTALTOPTIERVOLUME24H")
	val tOTALTOPTIERVOLUME24H: String,

	@field:SerializedName("CONVERSIONLASTUPDATE")
	val cONVERSIONLASTUPDATE: String,

	@field:SerializedName("FROMSYMBOL")
	val fROMSYMBOL: String,

	@field:SerializedName("LASTVOLUMETO")
	val lASTVOLUMETO: String,

	@field:SerializedName("CIRCULATINGSUPPLYMKTCAP")
	val cIRCULATINGSUPPLYMKTCAP: String,

	@field:SerializedName("CHANGEPCT24HOUR")
	val cHANGEPCT24HOUR: String,

	@field:SerializedName("OPENDAY")
	val oPENDAY: String,

	@field:SerializedName("TOTALTOPTIERVOLUME24HTO")
	val tOTALTOPTIERVOLUME24HTO: String,

	@field:SerializedName("VOLUMEDAYTO")
	val vOLUMEDAYTO: String,

	@field:SerializedName("OPENHOUR")
	val oPENHOUR: String,

	@field:SerializedName("CHANGE24HOUR")
	val cHANGE24HOUR: String,

	@field:SerializedName("CHANGEHOUR")
	val cHANGEHOUR: String,

	@field:SerializedName("HIGH24HOUR")
	val hIGH24HOUR: String,

	@field:SerializedName("VOLUME24HOURTO")
	val vOLUME24HOURTO: String,

	@field:SerializedName("HIGHHOUR")
	val hIGHHOUR: String,

	@field:SerializedName("LOWDAY")
	val lOWDAY: String,

	@field:SerializedName("MKTCAPPENALTY")
	val mKTCAPPENALTY: String
) : RealmObject

open class Weiss(

	@field:SerializedName("Rating")
	val rating: String,

	@field:SerializedName("TechnologyAdoptionRating")
	val technologyAdoptionRating: String,

	@field:SerializedName("MarketPerformanceRating")
	val marketPerformanceRating: String
) : RealmObject

open class RAW(

	@field:SerializedName("USD")
	val uSD: USD
) : RealmObject

data class MetaData(

	@field:SerializedName("Count")
	val count: Int
) : RealmObject

open class Rating(

	@field:SerializedName("Weiss")
	val weiss: Weiss
) : RealmObject

open class DISPLAY(

	@field:SerializedName("USD")
	val uSD: USD
) : RealmObject

open class CoinInfo(

	@field:SerializedName("Internal")
	val internal: String,

	@field:SerializedName("Rating")
	val rating: Rating,

	@field:SerializedName("BlockTime")
	val blockTime: Any,

	@field:SerializedName("ImageUrl")
	val imageUrl: String,

	@field:SerializedName("MaxSupply")
	val maxSupply: Any,

	@field:SerializedName("DocumentType")
	val documentType: String,

	@field:SerializedName("Algorithm")
	val algorithm: String,

	@field:SerializedName("Url")
	val url: String,

	@field:SerializedName("Name")
	val name: String,

	@field:SerializedName("Type")
	val type: Int,

	@field:SerializedName("ProofType")
	val proofType: String,

	@field:SerializedName("NetHashesPerSecond")
	val netHashesPerSecond: Any,

	@field:SerializedName("AssetLaunchDate")
	val assetLaunchDate: String,

	@field:SerializedName("FullName")
	val fullName: String,

	@field:SerializedName("Id")
	val id: String,

	@field:SerializedName("BlockNumber")
	val blockNumber: Int,

	@field:SerializedName("BlockReward")
	val blockReward: Any
) : RealmObject
