
import com.google.gson.annotations.SerializedName
data class MyEvent(
    @SerializedName("success")
    val success: String,
    @SerializedName("result")
    val result: Result,
    @SerializedName("records")
    val records: Records
)

data class Result(
    @SerializedName("resource_id")
    val resourceId: String,
    @SerializedName("fields")
    val fields: List<Field>
)

data class Records(
    @SerializedName("datasetDescription")
    val datasetDescription: String,
    @SerializedName("Tsunami")
    val tsunami: List<Tsunami>
)

data class Field(
    @SerializedName("id")
    val id: String,
    @SerializedName("type")
    val type: String
)

data class Tsunami(
    @SerializedName("ReportColor")
    val reportColor: String,
    @SerializedName("ReportContent")
    val reportContent: String,
    @SerializedName("ReportNo")
    val reportNo: String,
    @SerializedName("ReportType")
    val reportType: String,
    @SerializedName("TsunamiNo")
    val tsunamiNo: Int,
    @SerializedName("Web")
    val web: String,
    @SerializedName("EarthquakeInfo")
    val earthquakeInfo: EarthquakeInfo,
    @SerializedName("TsunamiWave")
    val tsunamiWave: TsunamiWave
)

data class EarthquakeInfo(
    @SerializedName("OriginTime")
    val originTime: String,
    @SerializedName("Source")
    val source: String,
    @SerializedName("FocalDepth")
    val focalDepth: Double,
    @SerializedName("Epicenter")
    val epicenter: Epicenter,
    @SerializedName("EarthquakeMagnitude")
    val earthquakeMagnitude: EarthquakeMagnitude
)

data class TsunamiWave(
    @SerializedName("WarningArea")
    val warningArea: List<WarningArea>,
    @SerializedName("TsuStation")
    val tsuStation: List<TsuStation>
)

data class Epicenter(
    @SerializedName("Location")
    val location: String,
    @SerializedName("EpicenterLatitude")
    val epicenterLatitude: Double,
    @SerializedName("EpicenterLongitude")
    val epicenterLongitude: Double
)

data class EarthquakeMagnitude(
    @SerializedName("MagnitudeValue")
    val magnitudeValue: Double
)

data class WarningArea(
    @SerializedName("AreaColor")
    val areaColor: String,
    @SerializedName("AreaDesc")
    val areaDesc: String,
    @SerializedName("AreaName")
    val areaName: String,
    @SerializedName("ArrivalTime")
    val arrivalTime: String,
    @SerializedName("InfoStatus")
    val infoStatus: String,
    @SerializedName("WaveHeight")
    val waveHeight: String
)

data class TsuStation(
    @SerializedName("ArrivalTime")
    val arrivalTime: String,
    @SerializedName("InfoStatus")
    val infoStatus: String,
    @SerializedName("StationID")
    val stationID: String,
    @SerializedName("StationName")
    val stationName: String,
    @SerializedName("StationLatitude")
    val stationLatitude: Double,
    @SerializedName("StationLongitude")
    val stationLongitude: Double,
    @SerializedName("WaveHeight")
    val waveHeight: String
)