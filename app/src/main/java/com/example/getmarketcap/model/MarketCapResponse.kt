package com.example.getmarketcap.model

import com.google.gson.annotations.SerializedName
import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.Ignore
import io.realm.annotations.RealmClass
import io.realm.kotlin.ext.realmListOf
import java.io.Serializable
import java.util.Collections.list

@RealmClass
	open class MarketCapResponse(
	@field:SerializedName("Type")
		var type: Int? = 0,

	@field:SerializedName("Message")
		var message: String? = "",

	@field:SerializedName("MetaData")
		var metaData: RealmList<MetaData> = RealmList(),

	@field:SerializedName("Data")
		var data: RealmList<DataItem> = RealmList(),

	@field:SerializedName("SponsoredData")
		var sponsoredData: String? = ""
	) : RealmObject(), Serializable

	@RealmClass
	open class CoinInfo(
		@SerializedName("Id") var id: String = "",
		@SerializedName("Name") var name: String = "",
		@SerializedName("FullName") var fullName: String = "",
		@SerializedName("Internal") var internalName: String = "",
		@SerializedName("ImageUrl") var imageUrl: String = "",
		@SerializedName("Url") var url: String = "",
		@SerializedName("Algorithm") var algorithm: String = "",
		@SerializedName("ProofType") var proofType: String = "",
		@SerializedName("NetHashesPerSecond") var netHashesPerSecond: Double = 0.0,
		@SerializedName("BlockNumber") var blockNumber: Int = 0,
		@SerializedName("BlockTime") var blockTime: Double = 0.0,
		@SerializedName("BlockReward") var blockReward: Double = 0.0,
		@SerializedName("AssetLaunchDate") var assetLaunchDate: String = "",
		@SerializedName("MaxSupply") var maxSupply: Double = 0.0,
		@SerializedName("Type") var type: Int = 0,
		@SerializedName("DocumentType") var documentType: String = ""
	) : RealmObject(), Serializable

	@RealmClass
	open class Rating(
		@SerializedName("Rating") var rating: String = "",
		@SerializedName("TechnologyAdoptionRating") var technologyAdoptionRating: String = "",
		@SerializedName("MarketPerformanceRating") var marketPerformanceRating: String = ""
	) : RealmObject(), Serializable

	@RealmClass
	open class Weiss(
		@SerializedName("Weiss") var weiss: Rating? = null
	) : RealmObject(), Serializable

	@RealmClass
	open class USD(
		@field:SerializedName("TYPE") var type: String = "",
		@field:SerializedName("MARKET") var market: String = "",
		@field:SerializedName("FROMSYMBOL") var fromSymbol: String = "",
		@field:SerializedName("TOSYMBOL") var toSymbol: String = "",
		@field:SerializedName("FLAGS") var flags: String = "",
		@field:SerializedName("LASTMARKET") var lastMarket: String = "",
		@field:SerializedName("MEDIAN") var median: Double = 0.0,
		@field:SerializedName("TOPTIERVOLUME24HOUR") var topTierVolume24Hour: Double = 0.0,
		@field:SerializedName("TOPTIERVOLUME24HOURTO") var topTierVolume24HourTo: Double = 0.0,
		@field:SerializedName("LASTTRADEID") var lastTradeId: String = "",
		@field:SerializedName("PRICE") var price: Double = 0.0,
		@field:SerializedName("LASTUPDATE") var lastUpdate: Long = 0L,
		@field:SerializedName("LASTVOLUME") var lastVolume: Double = 0.0,
		@field:SerializedName("LASTVOLUMETO") var lastVolumeTo: Double = 0.0,
	) : RealmObject(), Serializable

	@RealmClass
	open class RawUSD(

		@field:SerializedName("CONVERSIONTYPE") var cONVERSIONTYPE: String = "",
		@field:SerializedName("LASTTRADEID") var lASTTRADEID: String = "",
		@field:SerializedName("OPEN24HOUR") var oPEN24HOUR: Double = 0.0,
		@field:SerializedName("HIGHDAY") var hIGHDAY: Double = 0.0,
		@field:SerializedName("LOW24HOUR") var lOW24HOUR: Double = 0.0,
		@field:SerializedName("TOPTIERVOLUME24HOUR") val tOPTIERVOLUME24HOUR: Double = 0.0,
		@field:SerializedName("TOTALVOLUME24HTO") var tOTALVOLUME24HTO: Double = 0.0,
		@field:SerializedName("TOSYMBOL") var tOSYMBOL: String = "",
		@field:SerializedName("LASTMARKET") var lASTMARKET: String = "",
		@field:SerializedName("LASTVOLUME") var lASTVOLUME: Double = 0.0,
		@field:SerializedName("CIRCULATINGSUPPLY") var cIRCULATINGSUPPLY: Int = 0,
		@field:SerializedName("LOWHOUR") var lOWHOUR: Double = 0.0,
		@field:SerializedName("CONVERSIONSYMBOL") var cONVERSIONSYMBOL: String = "",
		@field:SerializedName("MKTCAP") var mKTCAP: Double = 0.0,
		@field:SerializedName("LASTUPDATE") var lASTUPDATE: Int = 0,
		@field:SerializedName("CHANGEPCTHOUR") var cHANGEPCTHOUR: Double = 0.0,
		@field:SerializedName("TOTALVOLUME24H") var tOTALVOLUME24H: Double = 0.0,
		@field:SerializedName("VOLUMEHOURTO")val vOLUMEHOURTO: Double = 0.0,
		@field:SerializedName("VOLUMEHOUR") var vOLUMEHOUR: Double = 0.0,
		@field:SerializedName("TOPTIERVOLUME24HOURTO") var tOPTIERVOLUME24HOURTO: Double = 0.0,
		@field:SerializedName("CHANGEDAY") var cHANGEDAY: Double = 0.0,
		@field:SerializedName("FLAGS") var fLAGS: String = "",
		@field:SerializedName("SUPPLY") var sUPPLY: Int = 0,
		@field:SerializedName("MEDIAN") var mEDIAN: Double = 0.0,
		@field:SerializedName("TYPE") var tYPE: String = "",
		@field:SerializedName("IMAGEURL") var iMAGEURL: String = "",
		@field:SerializedName("VOLUMEDAY") var vOLUMEDAY: Double = 0.0,
		@field:SerializedName("VOLUME24HOUR") var vOLUME24HOUR: Double = 0.0,
		@field:SerializedName("MARKET") var mARKET: String = "",
		@field:SerializedName("PRICE") var pRICE: Double = 0.0,
		@field:SerializedName("CHANGEPCTDAY") var cHANGEPCTDAY: Double = 0.0,
		@field:SerializedName("TOTALTOPTIERVOLUME24H") var tOTALTOPTIERVOLUME24H: Double = 0.0,
		@field:SerializedName("CONVERSIONLASTUPDATE") var cONVERSIONLASTUPDATE: Int = 0,
	) : RealmObject(), Serializable

	@RealmClass
	open class RAW(
		@SerializedName("USD") var usd: RawUSD? = null
	) : RealmObject(), Serializable

	@RealmClass
	open class DISPLAY(
		@SerializedName("USD") var usd: USD? = null
	) : RealmObject(), Serializable

	@RealmClass
	open class MetaData(
		@SerializedName("Count") var count: Int = 0
	) : RealmObject(), Serializable

	@RealmClass
	open class DataItem(
		@SerializedName("CoinInfo") var coinInfo: CoinInfo? = null,
		@SerializedName("RAW") var raw: RAW? = null,
		@SerializedName("DISPLAY") var display: DISPLAY? = null
	) : RealmObject(), Serializable
