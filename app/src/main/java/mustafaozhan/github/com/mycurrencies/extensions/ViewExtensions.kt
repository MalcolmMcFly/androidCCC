package mustafaozhan.github.com.mycurrencies.extensions

import android.annotation.SuppressLint
import android.view.animation.AnimationUtils
import android.webkit.WebView
import android.widget.ImageView
import android.widget.TextView
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import mustafaozhan.github.com.mycurrencies.R

/**
 * Created by Mustafa Ozhan on 2018-07-20.
 */
fun ImageView.setBackgroundByName(name: String) {
    when (name) {
        "AED" -> setImageResource(R.drawable.aed)
        "AFN" -> setImageResource(R.drawable.afn)
        "ALL" -> setImageResource(R.drawable.all)
        "AMD" -> setImageResource(R.drawable.amd)
        "ANG" -> setImageResource(R.drawable.ang)
        "AOA" -> setImageResource(R.drawable.aoa)
        "ARS" -> setImageResource(R.drawable.ars)
        "AUD" -> setImageResource(R.drawable.aud)
        "AWG" -> setImageResource(R.drawable.awg)
        "AZN" -> setImageResource(R.drawable.azn)
        "BAM" -> setImageResource(R.drawable.bam)
        "BBD" -> setImageResource(R.drawable.bbd)
        "BDT" -> setImageResource(R.drawable.bdt)
        "BGN" -> setImageResource(R.drawable.bgn)
        "BHD" -> setImageResource(R.drawable.bhd)
        "BIF" -> setImageResource(R.drawable.bif)
        "BMD" -> setImageResource(R.drawable.bmd)
        "BND" -> setImageResource(R.drawable.bnd)
        "BOB" -> setImageResource(R.drawable.bob)
        "BRL" -> setImageResource(R.drawable.brl)
        "BSD" -> setImageResource(R.drawable.bsd)
        "BTC" -> setImageResource(R.drawable.btc)
        "BTN" -> setImageResource(R.drawable.btn)
        "BWP" -> setImageResource(R.drawable.bwp)
        "BYN" -> setImageResource(R.drawable.byn)
        "BYR" -> setImageResource(R.drawable.byr)
        "BZD" -> setImageResource(R.drawable.bzd)
        "CAD" -> setImageResource(R.drawable.cad)
        "CDF" -> setImageResource(R.drawable.cdf)
        "CHF" -> setImageResource(R.drawable.chf)
        "CLF" -> setImageResource(R.drawable.clf)
        "CLP" -> setImageResource(R.drawable.clp)
        "CNY" -> setImageResource(R.drawable.cny)
        "COP" -> setImageResource(R.drawable.cop)
        "CRC" -> setImageResource(R.drawable.crc)
        "CUC" -> setImageResource(R.drawable.cuc)
        "CUP" -> setImageResource(R.drawable.cup)
        "CVE" -> setImageResource(R.drawable.cve)
        "CZK" -> setImageResource(R.drawable.czk)
        "DJF" -> setImageResource(R.drawable.djf)
        "DKK" -> setImageResource(R.drawable.dkk)
        "DOP" -> setImageResource(R.drawable.dop)
        "DZD" -> setImageResource(R.drawable.dzd)
        "EGP" -> setImageResource(R.drawable.egp)
        "ERN" -> setImageResource(R.drawable.ern)
        "ETB" -> setImageResource(R.drawable.etb)
        "EUR" -> setImageResource(R.drawable.eur)
        "FJD" -> setImageResource(R.drawable.fjd)
        "FKP" -> setImageResource(R.drawable.fkp)
        "GBP" -> setImageResource(R.drawable.gbp)
        "GEL" -> setImageResource(R.drawable.gel)
        "GGP" -> setImageResource(R.drawable.ggp)
        "GHS" -> setImageResource(R.drawable.ghs)
        "GIP" -> setImageResource(R.drawable.gip)
        "GMD" -> setImageResource(R.drawable.gmd)
        "GNF" -> setImageResource(R.drawable.gnf)
        "GTQ" -> setImageResource(R.drawable.gtq)
        "GYD" -> setImageResource(R.drawable.gyd)
        "HKD" -> setImageResource(R.drawable.hkd)
        "HNL" -> setImageResource(R.drawable.hnl)
        "HRK" -> setImageResource(R.drawable.hrk)
        "HTG" -> setImageResource(R.drawable.htg)
        "HUF" -> setImageResource(R.drawable.huf)
        "IDR" -> setImageResource(R.drawable.idr)
        "ILS" -> setImageResource(R.drawable.ils)
        "IMP" -> setImageResource(R.drawable.imp)
        "INR" -> setImageResource(R.drawable.inr)
        "IQD" -> setImageResource(R.drawable.iqd)
        "IRR" -> setImageResource(R.drawable.irr)
        "ISK" -> setImageResource(R.drawable.isk)
        "JEP" -> setImageResource(R.drawable.jep)
        "JMD" -> setImageResource(R.drawable.jmd)
        "JOD" -> setImageResource(R.drawable.jod)
        "JPY" -> setImageResource(R.drawable.jpy)
        "KES" -> setImageResource(R.drawable.kes)
        "KGS" -> setImageResource(R.drawable.kgs)
        "KHR" -> setImageResource(R.drawable.khr)
        "KMF" -> setImageResource(R.drawable.kmf)
        "KPW" -> setImageResource(R.drawable.kpw)
        "KRW" -> setImageResource(R.drawable.krw)
        "KWD" -> setImageResource(R.drawable.kwd)
        "KYD" -> setImageResource(R.drawable.kyd)
        "KZT" -> setImageResource(R.drawable.kzt)
        "LAK" -> setImageResource(R.drawable.lak)
        "LBP" -> setImageResource(R.drawable.lbp)
        "LKR" -> setImageResource(R.drawable.lkr)
        "LRD" -> setImageResource(R.drawable.lrd)
        "LSL" -> setImageResource(R.drawable.lsl)
        "LTL" -> setImageResource(R.drawable.ltl)
        "LVL" -> setImageResource(R.drawable.lvl)
        "LYD" -> setImageResource(R.drawable.lyd)
        "MAD" -> setImageResource(R.drawable.mad)
        "MDL" -> setImageResource(R.drawable.mdl)
        "MGA" -> setImageResource(R.drawable.mga)
        "MKD" -> setImageResource(R.drawable.mkd)
        "MMK" -> setImageResource(R.drawable.mmk)
        "MNT" -> setImageResource(R.drawable.mnt)
        "MOP" -> setImageResource(R.drawable.mop)
        "MRO" -> setImageResource(R.drawable.mro)
        "MUR" -> setImageResource(R.drawable.mur)
        "MVR" -> setImageResource(R.drawable.mvr)
        "MWK" -> setImageResource(R.drawable.mwk)
        "MXN" -> setImageResource(R.drawable.mxn)
        "MYR" -> setImageResource(R.drawable.myr)
        "MZN" -> setImageResource(R.drawable.mzn)
        "NAD" -> setImageResource(R.drawable.nad)
        "NGN" -> setImageResource(R.drawable.ngn)
        "NIO" -> setImageResource(R.drawable.nio)
        "NOK" -> setImageResource(R.drawable.nok)
        "NPR" -> setImageResource(R.drawable.npr)
        "NZD" -> setImageResource(R.drawable.nzd)
        "OMR" -> setImageResource(R.drawable.omr)
        "PAB" -> setImageResource(R.drawable.pab)
        "PEN" -> setImageResource(R.drawable.pen)
        "PGK" -> setImageResource(R.drawable.pgk)
        "PHP" -> setImageResource(R.drawable.php)
        "PKR" -> setImageResource(R.drawable.pkr)
        "PLN" -> setImageResource(R.drawable.pln)
        "PYG" -> setImageResource(R.drawable.pyg)
        "QAR" -> setImageResource(R.drawable.qar)
        "RON" -> setImageResource(R.drawable.ron)
        "RSD" -> setImageResource(R.drawable.rsd)
        "RUB" -> setImageResource(R.drawable.rub)
        "RWF" -> setImageResource(R.drawable.rwf)
        "SAR" -> setImageResource(R.drawable.sar)
        "SBD" -> setImageResource(R.drawable.sbd)
        "SCR" -> setImageResource(R.drawable.scr)
        "SDG" -> setImageResource(R.drawable.sdg)
        "SEK" -> setImageResource(R.drawable.sek)
        "SGD" -> setImageResource(R.drawable.sgd)
        "SHP" -> setImageResource(R.drawable.shp)
        "SLL" -> setImageResource(R.drawable.sll)
        "SOS" -> setImageResource(R.drawable.sos)
        "SRD" -> setImageResource(R.drawable.srd)
        "STD" -> setImageResource(R.drawable.std)
        "SVC" -> setImageResource(R.drawable.svc)
        "SYP" -> setImageResource(R.drawable.syp)
        "SZL" -> setImageResource(R.drawable.szl)
        "THB" -> setImageResource(R.drawable.thb)
        "TJS" -> setImageResource(R.drawable.tjs)
        "TMT" -> setImageResource(R.drawable.tmt)
        "TND" -> setImageResource(R.drawable.tnd)
        "TOP" -> setImageResource(R.drawable.top)
        "TRY" -> setImageResource(R.drawable.tryy)
        "TTD" -> setImageResource(R.drawable.ttd)
        "TWD" -> setImageResource(R.drawable.twd)
        "TZS" -> setImageResource(R.drawable.tzs)
        "UAH" -> setImageResource(R.drawable.uah)
        "UGX" -> setImageResource(R.drawable.ugx)
        "USD" -> setImageResource(R.drawable.usd)
        "UYU" -> setImageResource(R.drawable.uyu)
        "UZS" -> setImageResource(R.drawable.uzs)
        "VEF" -> setImageResource(R.drawable.vef)
        "VND" -> setImageResource(R.drawable.vnd)
        "VUV" -> setImageResource(R.drawable.vuv)
        "WST" -> setImageResource(R.drawable.wst)
        "XAF" -> setImageResource(R.drawable.xaf)
        "XAG" -> setImageResource(R.drawable.xag)
        "XAU" -> setImageResource(R.drawable.xau)
        "XCD" -> setImageResource(R.drawable.xcd)
        "XDR" -> setImageResource(R.drawable.xdr)
        "XOF" -> setImageResource(R.drawable.xof)
        "XPF" -> setImageResource(R.drawable.xpf)
        "YER" -> setImageResource(R.drawable.yer)
        "ZAR" -> setImageResource(R.drawable.zar)
        "ZMK" -> setImageResource(R.drawable.zmk)
        "ZMW" -> setImageResource(R.drawable.zmw)
        "ZWL" -> setImageResource(R.drawable.zwl)
        "transparent" -> setImageResource(R.drawable.transparent)
        else -> setImageResource(R.drawable.transparent)
    }
}

@SuppressLint("SetTextI18n")
fun TextView.addText(str: String) {
    text = text.toString() + str
}

fun AdView.loadAd(adId: Int) {
    MobileAds.initialize(context, resources.getString(adId))
    val adRequest = AdRequest.Builder().build()
    loadAd(adRequest)
}

fun WebView.fadeIO(isIn: Boolean) =
    startAnimation(AnimationUtils.loadAnimation(context, if (isIn) R.anim.fade_in else R.anim.fade_out))
