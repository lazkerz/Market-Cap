package com.example.getmarketcap.model.MarketCapResponse

import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey

open class MarketCapResponse : RealmObject {
	var data: List<DataItem> = mutableListOf()
}

open class USDRealm : RealmObject {
	var cONVERSIONTYPE: String? = null
	var lASTTRADEID: String? = null
	var oPEN24HOUR: String? = null
	var hIGHDAY: String? = null
	var lOW24HOUR: String? = null
	var tOPTIERVOLUME24HOUR: String? = null
	var tOTALVOLUME24HTO: String? = null
	var tOSYMBOL: String? = null
	var lASTMARKET: String? = null
	var lASTVOLUME: String? = null
	var cIRCULATINGSUPPLY: String? = null
	var lOWHOUR: String? = null
	var cONVERSIONSYMBOL: String? = null
	var mKTCAP: String? = null
	var lASTUPDATE: String? = null
	var cHANGEPCTHOUR: String? = null
	var tOTALVOLUME24H: String? = null
	var vOLUMEHOURTO: String? = null
	var vOLUMEHOUR: String? = null
	var tOPTIERVOLUME24HOURTO: String? = null
	var cHANGEDAY: String? = null
	var fLAGS: String? = null
	var sUPPLY: String? = null
	var mEDIAN: String? = null // Ganti dengan tipe yang sesuai
	var tYPE: String? = null
	var iMAGEURL: String? = null
	var vOLUMEDAY: String? = null
	var vOLUME24HOUR: String? = null
	var mARKET: String? = null
	var pRICE: String? = null
	var cHANGEPCTDAY: String? = null
	var tOTALTOPTIERVOLUME24H: String? = null
	var cONVERSIONLASTUPDATE: String? = null
	var fROMSYMBOL: String? = null
	var lASTVOLUMETO: String? = null
	var cIRCULATINGSUPPLYMKTCAP: String? = null
	var cHANGEPCT24HOUR: String? = null
	var oPENDAY: String? = null
	var tOTALTOPTIERVOLUME24HTO: String? = null
	var vOLUMEDAYTO: String? = null
	var oPENHOUR: String? = null
	var cHANGE24HOUR: String? = null
	var cHANGEHOUR: String? = null
	var hIGH24HOUR: String? = null
	var vOLUME24HOURTO: String? = null
	var hIGHHOUR: String? = null
	var lOWDAY: String? = null
	var mKTCAPPENALTY: String? = null
}

open class RAWRealm : RealmObject {
	var uSD: USDRealm? = null
}

open class WeissRealm : RealmObject {
	var rating: String? = null
	var technologyAdoptionRating: String? = null
	var marketPerformanceRating: String? = null
}

open class RatingRealm : RealmObject {
	var weiss: WeissRealm? = null
}

open class DISPLAYRealm : RealmObject {
	var uSD: USDRealm? = null
}

open class CoinInfoRealm : RealmObject {
	var internal: String? = null
	var rating: RatingRealm? = null
	var blockTime: String? = null // Ganti dengan tipe yang sesuai
	var imageUrl: String? = null
	var maxSupply: String? = null // Ganti dengan tipe yang sesuai
	var documentType: String? = null
	var algorithm: String? = null
	var url: String? = null
	var name: String? = null
	var type: Int = 0
	var proofType: String? = null
	var netHashesPerSecond: String? = null // Ganti dengan tipe yang sesuai
	var assetLaunchDate: String? = null
	var fullName: String? = null
	@PrimaryKey
	var id: String? = null
	var blockNumber: Int = 0
	var blockReward: String? = null // Ganti dengan tipe yang sesuai
}

open class DataItem: RealmObject {
	var dISPLAY: DISPLAYRealm? = null
	var rAW: RAWRealm? = null
	var coinInfo: CoinInfoRealm? = null
}
