import com.google.gson.annotations.SerializedName
import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass

@RealmClass
open class MarketCapResponseRealm(
	var data: RealmList<DataItemRealm> = RealmList()
) : RealmObject()

@RealmClass
open class USDRealm(
	var cONVERSIONTYPE: String? = null,
	var lASTTRADEID: String? = null,
	var oPEN24HOUR: String? = null,
	var hIGHDAY: String? = null,
	var lOW24HOUR: String? = null,
	var tOPTIERVOLUME24HOUR: String? = null,
	var tOTALVOLUME24HTO: String? = null,
	var tOSYMBOL: String? = null,
	var lASTMARKET: String? = null,
	var lASTVOLUME: String? = null,
	var cIRCULATINGSUPPLY: String? = null,
	var lOWHOUR: String? = null,
	var cONVERSIONSYMBOL: String? = null,
	var mKTCAP: String? = null,
	var lASTUPDATE: String? = null,
	var cHANGEPCTHOUR: String? = null,
	var tOTALVOLUME24H: String? = null,
	var vOLUMEHOURTO: String? = null,
	var vOLUMEHOUR: String? = null,
	var tOPTIERVOLUME24HOURTO: String? = null,
	var cHANGEDAY: String? = null,
	var fLAGS: String? = null,
	var sUPPLY: String? = null,
	var mEDIAN: Any? = null,
	var tYPE: String? = null,
	var iMAGEURL: String? = null,
	var vOLUMEDAY: String? = null,
	var vOLUME24HOUR: String? = null,
	var mARKET: String? = null,
	var pRICE: String? = null,
	var cHANGEPCTDAY: String? = null,
	var tOTALTOPTIERVOLUME24H: String? = null,
	var cONVERSIONLASTUPDATE: String? = null,
	var fROMSYMBOL: String? = null,
	var lASTVOLUMETO: String? = null,
	var cIRCULATINGSUPPLYMKTCAP: String? = null,
	var cHANGEPCT24HOUR: String? = null,
	var oPENDAY: String? = null,
	var tOTALTOPTIERVOLUME24HTO: String? = null,
	var vOLUMEDAYTO: String? = null,
	var oPENHOUR: String? = null,
	var cHANGE24HOUR: String? = null,
	var cHANGEHOUR: String? = null,
	var hIGH24HOUR: String? = null,
	var vOLUME24HOURTO: String? = null,
	var hIGHHOUR: String? = null,
	var lOWDAY: String? = null,
	var mKTCAPPENALTY: String? = null
) : RealmObject()

@RealmClass
open class RAWRealm(
	var uSD: USDRealm? = null
) : RealmObject()

@RealmClass
open class RatingRealm(
	var weiss: WeissRealm? = null
) : RealmObject()

@RealmClass
open class DISPLAYRealm(
	var uSD: USDRealm? = null
) : RealmObject()

@RealmClass
open class WeissRealm(
	var rating: String? = null,
	var technologyAdoptionRating: String? = null,
	var marketPerformanceRating: String? = null
) : RealmObject()

@RealmClass
open class DataItemRealm(
	var dISPLAY: DISPLAYRealm? = null,
	var rAW: RAWRealm? = null,
	var coinInfo: CoinInfoRealm? = null
) : RealmObject()

@RealmClass
open class CoinInfoRealm(
	var internal: String? = null,
	var rating: RatingRealm? = null,
	var blockTime: Any? = null,
	var imageUrl: String? = null,
	var maxSupply: Any? = null,
	var documentType: String? = null,
	var algorithm: String? = null,
	var url: String? = null,
	var name: String? = null,
	var type: Int? = null,
	var proofType: String? = null,
	var netHashesPerSecond: Any? = null,
	var assetLaunchDate: String? = null,
	var fullName: String? = null,
	@PrimaryKey
	var id: String? = null,
	var blockNumber: Int? = null,
	var blockReward: Any? = null
) : RealmObject()
