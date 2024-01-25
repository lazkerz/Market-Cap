package com.example.getmarketcap.model

import com.google.gson.annotations.SerializedName
import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.RealmClass
import java.io.Serializable

@RealmClass
	open class Top24Response(

	@SerializedName("Message")
	var message: String = "",

	@SerializedName("Type")
	var type: Int = 0,

	@SerializedName("MetaData")
	var metaData: MetaData?= null,

	@SerializedName("Data")
	var data: RealmList<DataItem> = RealmList(),

//	@field:SerializedName("SponsoredData")
//	val sponsoredData: List<Any>
) : RealmObject(), Serializable

@RealmClass
open class MetaData(
	@SerializedName("Count") var count: Int = 0,
): RealmObject(), Serializable

@RealmClass
open class Weiss(
	@SerializedName("Weiss") var weiss: Rating? = null
) : RealmObject(), Serializable

@RealmClass
open class CoinInfo(
	@SerializedName("Internal") var internal: String = "",
	@SerializedName("BlockTime") var blockTime: Double = 0.0,
	@SerializedName("ImageUrl") var imageUrl: String = "",
	@SerializedName("MaxSupply") var maxSupply: Double = 0.0,
	@SerializedName("DocumentType") var documentType: String = "",
	@SerializedName("Algorithm") var algorithm: String = "",
	@SerializedName("Url") var url: String = "",
	@SerializedName("Name") var name: String = "",
	@SerializedName("Type") var type: Int = 0,
	@SerializedName("ProofType") var proofType: String = "",
	@SerializedName("NetHashesPerSecond") var netHashesPerSecond: Double = 0.0,
	@SerializedName("AssetLaunchDate") var assetLaunchDate: String = "",
	@SerializedName("FullName") var fullName: String = "",
	@SerializedName("Id") var id: String = "",
	@SerializedName("BlockNumber") var blockNumber: Int = 0,
	@SerializedName("BlockReward") var blockReward: Double = 0.0,
): RealmObject(), Serializable

@RealmClass
open class DisplayUSD(
	@SerializedName("CONVERSIONTYPE") var cONVERSIONTYPE: String = "",
	@SerializedName("LASTTRADEID") var lASTTRADEID: String ="",
	@SerializedName("OPEN24HOUR") var oPEN24HOUR: String = "",
	@SerializedName("HIGHDAY") var hIGHDAY: String = "",
	@SerializedName("LOW24HOUR") var lOW24HOUR: String = "",
	@SerializedName("TOPTIERVOLUME24HOUR") var tOPTIERVOLUME24HOUR: String = "",
	@SerializedName("TOTALVOLUME24HTO") var tOTALVOLUME24HTO: String = "",
	@SerializedName("TOSYMBOL") var tOSYMBOL: String = "",
	@SerializedName("LASTMARKET") var lASTMARKET: String = "",
	@SerializedName("LASTVOLUME") var lASTVOLUME: String = "",
	@SerializedName("CIRCULATINGSUPPLY") var cIRCULATINGSUPPLY: String = "",
	@SerializedName("LOWHOUR") var lOWHOUR: String = "",
	@SerializedName("CONVERSIONSYMBOL") var cONVERSIONSYMBOL: String = "",
	@SerializedName("MKTCAP") var mKTCAP: String = "",
	@SerializedName("LASTUPDATE") var lASTUPDATE: String = "",
	@SerializedName("CHANGEPCTHOUR") var cHANGEPCTHOUR: String = "",
	@SerializedName("TOTALVOLUME24H") var tOTALVOLUME24H: String = "",
	@SerializedName("VOLUMEHOURTO") var vOLUMEHOURTO: String = "",
	@SerializedName("VOLUMEHOUR") var vOLUMEHOUR: String = "",
	@SerializedName("TOPTIERVOLUME24HOURTO") var tOPTIERVOLUME24HOURTO: String = "",
	@SerializedName("CHANGEDAY") var cHANGEDAY: String = "",
	@SerializedName("FLAGS") var fLAGS: String = "",
	@SerializedName("SUPPLY") var sUPPLY: String = "",
	@SerializedName("MEDIAN") var mEDIAN: Double = 0.0,
	@SerializedName("TYPE") var tYPE: String = "",
	@SerializedName("IMAGEURL") var iMAGEURL: String = "",
	@SerializedName("VOLUMEDAY") var vOLUMEDAY: String = "",
	@SerializedName("VOLUME24HOUR") var vOLUME24HOUR: String = "",
	@SerializedName("MARKET") var mARKET: String ="",
	@SerializedName("PRICE") var pRICE: String = "",
	@SerializedName("CHANGEPCTDAY") var cHANGEPCTDAY: String = "",
	@SerializedName("TOTALTOPTIERVOLUME24H") var tOTALTOPTIERVOLUME24H: String = "",
	@SerializedName("CONVERSIONLASTUPDATE") var cONVERSIONLASTUPDATE: String = "",
	@SerializedName("FROMSYMBOL") var fROMSYMBOL: String = "",
	@SerializedName("LASTVOLUMETO") var lASTVOLUMETO: String = "",
	@SerializedName("CIRCULATINGSUPPLYMKTCAP") var cIRCULATINGSUPPLYMKTCAP: String = "",
	@SerializedName("CHANGEPCT24HOUR") var cHANGEPCT24HOUR: String = "",
	@SerializedName("OPENDAY") var oPENDAY: String = "",
	@SerializedName("TOTALTOPTIERVOLUME24HTO") var tOTALTOPTIERVOLUME24HTO: String ="",
	@SerializedName("VOLUMEDAYTO") var vOLUMEDAYTO: String = "",
	@SerializedName("OPENHOUR") var oPENHOUR: String = "",
	@SerializedName("CHANGE24HOUR") var cHANGE24HOUR: String = "",
	@SerializedName("CHANGEHOUR") var cHANGEHOUR: String = "",
	@SerializedName("HIGH24HOUR") var hIGH24HOUR: String = "",
	@SerializedName("VOLUME24HOURTO") var vOLUME24HOURTO: String = "",
	@SerializedName("HIGHHOUR") var hIGHHOUR: String = "",
	@SerializedName("LOWDAY") var lOWDAY: String = "",
	@SerializedName("MKTCAPPENALTY") var mKTCAPPENALTY: String = ""
): RealmObject(), Serializable

@RealmClass
open class RawUSD(
	@SerializedName("CONVERSIONTYPE") var cONVERSIONTYPE: Double = 0.0,
	@SerializedName("LASTTRADEID") var lASTTRADEID: Double = 0.0,
	@SerializedName("OPEN24HOUR") var oPEN24HOUR: Double = 0.0,
	@SerializedName("HIGHDAY") var hIGHDAY: Double = 0.0,
	@SerializedName("LOW24HOUR") var lOW24HOUR: Double = 0.0,
	@SerializedName("TOPTIERVOLUME24HOUR") var tOPTIERVOLUME24HOUR: Double = 0.0,
	@SerializedName("TOTALVOLUME24HTO") var tOTALVOLUME24HTO: Double = 0.0,
	@SerializedName("TOSYMBOL") var tOSYMBOL: String = "",
	@SerializedName("LASTMARKET") var lASTMARKET: String = "",
	@SerializedName("LASTVOLUME") var lASTVOLUME: Double = 0.0,
	@SerializedName("CIRCULATINGSUPPLY") var cIRCULATINGSUPPLY: Double = 0.0,
	@SerializedName("LOWHOUR") var lOWHOUR: Double = 0.0,
	@SerializedName("CONVERSIONSYMBOL") var cONVERSIONSYMBOL: String = "",
	@SerializedName("MKTCAP") var mKTCAP: Double = 0.0,
	@SerializedName("LASTUPDATE") var lASTUPDATE: String = "",
	@SerializedName("CHANGEPCTHOUR") var cHANGEPCTHOUR: Double = 0.0,
	@SerializedName("TOTALVOLUME24H") var tOTALVOLUME24H: Double = 0.0,
	@SerializedName("VOLUMEHOURTO") var vOLUMEHOURTO: Double = 0.0,
	@SerializedName("VOLUMEHOUR") var vOLUMEHOUR: Double = 0.0,
	@SerializedName("TOPTIERVOLUME24HOURTO") var tOPTIERVOLUME24HOURTO: Double = 0.0,
	@SerializedName("CHANGEDAY") var cHANGEDAY: Double = 0.0,
	@SerializedName("SUPPLY") var sUPPLY: Double = 0.0,
	@SerializedName("IMAGEURL") var iMAGEURL: String = "",
	@SerializedName("VOLUMEDAY") var vOLUMEDAY: Double = 0.0,
	@SerializedName("VOLUME24HOUR") var vOLUME24HOUR: Double = 0.0,
	@SerializedName("MARKET") var mARKET: String ="",
	@SerializedName("PRICE") var pRICE: Double = 0.0,
	@SerializedName("CHANGEPCTDAY") var cHANGEPCTDAY: Double = 0.0,
	@SerializedName("TOTALTOPTIERVOLUME24H") var tOTALTOPTIERVOLUME24H: Double = 0.0,
	@SerializedName("CONVERSIONLASTUPDATE") var cONVERSIONLASTUPDATE: String = "",
	@SerializedName("FROMSYMBOL") var fROMSYMBOL: String = "",
	@SerializedName("LASTVOLUMETO") var lASTVOLUMETO: Double = 0.0,
	@SerializedName("CIRCULATINGSUPPLYMKTCAP") var cIRCULATINGSUPPLYMKTCAP: Double = 0.0,
	@SerializedName("CHANGEPCT24HOUR") var cHANGEPCT24HOUR: Double = 0.0,
	@SerializedName("OPENDAY") var oPENDAY: Double = 0.0,
	@SerializedName("TOTALTOPTIERVOLUME24HTO") var tOTALTOPTIERVOLUME24HTO: Double = 0.0,
	@SerializedName("VOLUMEDAYTO") var vOLUMEDAYTO: Double = 0.0,
	@SerializedName("OPENHOUR") var oPENHOUR: Double = 0.0,
	@SerializedName("CHANGE24HOUR") var cHANGE24HOUR: Double = 0.0,
	@SerializedName("CHANGEHOUR") var cHANGEHOUR: Double = 0.0,
	@SerializedName("HIGH24HOUR") var hIGH24HOUR: Double = 0.0,
	@SerializedName("VOLUME24HOURTO") var vOLUME24HOURTO: String = "",
	@SerializedName("HIGHHOUR") var hIGHHOUR: String = "",
	@SerializedName("LOWDAY") var lOWDAY: Double = 0.0
): RealmObject(), Serializable

@RealmClass
open class RAW(
	@SerializedName("USD") var uSD: RawUSD? = null
): RealmObject(), Serializable

@RealmClass
open class Rating(
	@SerializedName("Rating") var rating: String = "",
	@SerializedName("TechnologyAdoptionRating") var technologyAdoptionRating: String = "",
	@SerializedName("MarketPerformanceRating") var marketPerformanceRating: String = ""
): RealmObject(), Serializable

@RealmClass
open class DISPLAY(
	@SerializedName("USD") var uSD: DisplayUSD? = null
):RealmObject(), Serializable

@RealmClass
open class DataItem(
	@SerializedName("DISPLAY") var dISPLAY: DISPLAY? = null,
	@SerializedName("RAW") var rAW: RAW? = null,
	@SerializedName("CoinInfo") var coinInfo: CoinInfo? = null
): RealmObject(), Serializable
