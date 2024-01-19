package com.example.getmarketcap.model

import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass
import io.realm.annotations.Required
import java.io.Serializable

@RealmClass
open class MarketCapResponse (
	@field:SerializedName("Type")
	var type: Int? = null,

	@field:SerializedName("Message")
	var message: String? = null,

	@field:SerializedName("MetaData")
	var metaData: MetaData? = null,

	@field:SerializedName("Data")
	var data: List<DataItem>,

	@field:SerializedName("SponsoredData")
	var sponsoredData: Any? = null
)
@RealmClass
open class CoinInfo(
	@PrimaryKey
	@Required
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
) : Serializable
@RealmClass
open class Rating(
	@SerializedName("Rating") var rating: String = "",
	@SerializedName("TechnologyAdoptionRating") var technologyAdoptionRating: String = "",
	@SerializedName("MarketPerformanceRating") var marketPerformanceRating: String = ""
) : RealmObject(), Serializable

@RealmClass
open class Weiss(
	@SerializedName("Weiss") var weiss: Rating? = null
)

@RealmClass
open class USD(
	@PrimaryKey
	@Required
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
)

@RealmClass
open class RAW(
	@PrimaryKey
	@Required
	@SerializedName("USD") var usd: USD? = null
)

@RealmClass
open class DISPLAY(
	@PrimaryKey
	@Required
	@SerializedName("USD") var usd: USD? = null
)

@RealmClass
open class MetaData(
	@PrimaryKey
	@Required
	@SerializedName("Count") var count: Int = 0
)

@RealmClass
open class DataItem(
	@PrimaryKey
	@Required
	@SerializedName("CoinInfo") var coinInfo: CoinInfo? = null,
	@SerializedName("RAW") var raw: RAW? = null,
	@SerializedName("DISPLAY") var display: DISPLAY? = null
)
