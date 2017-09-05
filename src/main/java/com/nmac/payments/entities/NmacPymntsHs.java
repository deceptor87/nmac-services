/*
 * Created on 5 Sep 2017 ( Time 14:30:03 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite) 

package com.nmac.payments.entities;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "nmac_pymnts_hs"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="nmac_pymnts_hs", schema="public" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="NmacPymntsHs.countAll", query="SELECT COUNT(x) FROM NmacPymntsHs x" )
} )
public class NmacPymntsHs implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @Column(name="id", nullable=false)
    private Integer    id           ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    

    @Column(name="pymnt_hs_ky")
    private Integer    pymntHsKy    ;


    @Column(name="usr_id", length=40)
    private String     usrId        ;


    @Column(name="fncl_acnt_id", length=40)
    private String     fnclAcntId   ;


    @Column(name="paye_ky")
    private BigDecimal payeKy       ;


    @Column(name="pymnt_acnt_id", length=255)
    private String     pymntAcntId  ;


    @Column(name="pymnt_typ_nm", length=10)
    private String     pymntTypNm   ;


    @Column(name="pymnt_am")
    private BigDecimal pymntAm      ;


    @Column(name="am_typ_nm", length=40)
    private String     amTypNm      ;


    @Column(name="pymnt_intrvl_dy_nb")
    private BigDecimal pymntIntrvlDyNb ;


    @Column(name="pymnt_intrvl_mnth_nb")
    private BigDecimal pymntIntrvlMnthNb ;


    @Column(name="pymnt_intrvl_tx", length=20)
    private String     pymntIntrvlTx ;


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="strt_ts")
    private Date       strtTs       ;


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="end_ts")
    private Date       endTs        ;


    @Column(name="max_pymnt_nb")
    private BigDecimal maxPymntNb   ;


    @Column(name="crnt_pymnt_nb")
    private BigDecimal crntPymntNb  ;


    @Column(name="pymnt_sts_tx", length=10)
    private String     pymntStsTx   ;


    @Column(name="eml_in", length=1)
    private String     emlIn        ;


    @Column(name="bl_schdld_in", length=1)
    private String     blSchdldIn   ;


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="lst_prcs_ts")
    private Date       lstPrcsTs    ;


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="nxt_pymnt_ts")
    private Date       nxtPymntTs   ;


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="lst_pymnt_ts")
    private Date       lstPymntTs   ;


    @Column(name="flex_clmn1_tx", length=255)
    private String     flexClmn1Tx  ;


    @Column(name="flex_clmn2_tx", length=255)
    private String     flexClmn2Tx  ;


    @Column(name="pymnt_acnt_ky", length=40)
    private String     pymntAcntKy  ;


    @Column(name="nxt_due_am")
    private BigDecimal nxtDueAm     ;


    @Column(name="late_chrg_am")
    private BigDecimal lateChrgAm   ;


    @Column(name="msclns_am")
    private BigDecimal msclnsAm     ;


    @Column(name="adtnl_am")
    private BigDecimal adtnlAm      ;


    @Column(name="prcpal_am")
    private BigDecimal prcpalAm     ;


    @Column(name="prprty_tax_am")
    private BigDecimal prprtyTaxAm  ;


    @Column(name="othr_am")
    private BigDecimal othrAm       ;


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="mturty_ts")
    private Date       mturtyTs     ;


    @Column(name="to_pd_am")
    private BigDecimal toPdAm       ;


    @Column(name="dlt_pymnt_for_tx", length=12)
    private String     dltPymntForTx ;


    @Column(name="pymnt_src_cd", length=1)
    private String     pymntSrcCd   ;


    @Column(name="adt_oprtn_cd")
    private BigDecimal adtOprtnCd   ;


    @Column(name="adt_sts_cd")
    private BigDecimal adtStsCd     ;


    @Column(name="adt_rsn_tx", length=2000)
    private String     adtRsnTx     ;


    @Column(name="job_ky")
    private BigDecimal jobKy        ;


    @Column(name="job_nm", length=42)
    private String     jobNm        ;


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="adt_ts")
    private Date       adtTs        ;


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="crte_ts")
    private Date       crteTs       ;


    @Column(name="crte_usr_id", length=255)
    private String     crteUsrId    ;


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updt_ts")
    private Date       updtTs       ;


    @Column(name="updt_usr_id", length=255)
    private String     updtUsrId    ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public NmacPymntsHs()
    {
		super();
    }

    public NmacPymntsHs update(NmacPymntsHs a) {
		this.id = a.id;
        this.pymntHsKy = a.pymntHsKy;
        this.usrId = a.usrId;
        this.fnclAcntId = a.fnclAcntId;
        this.payeKy = a.payeKy;
        this.pymntAcntId = a.pymntAcntId;
        this.pymntTypNm = a.pymntTypNm;
        this.pymntAm = a.pymntAm;
        this.amTypNm = a.amTypNm;
        this.pymntIntrvlDyNb = a.pymntIntrvlDyNb;
        this.pymntIntrvlMnthNb = a.pymntIntrvlMnthNb;
        this.pymntIntrvlTx = a.pymntIntrvlTx;
        this.strtTs = a.strtTs;
        this.endTs = a.endTs;
        this.maxPymntNb = a.maxPymntNb;
        this.crntPymntNb = a.crntPymntNb;
        this.pymntStsTx = a.pymntStsTx;
        this.emlIn = a.emlIn;
        this.blSchdldIn = a.blSchdldIn;
        this.lstPrcsTs = a.lstPrcsTs;
        this.nxtPymntTs = a.nxtPymntTs;
        this.lstPymntTs = a.lstPymntTs;
        this.flexClmn1Tx = a.flexClmn1Tx;
        this.flexClmn2Tx = a.flexClmn2Tx;
        this.pymntAcntKy = a.pymntAcntKy;
        this.nxtDueAm = a.nxtDueAm;
        this.lateChrgAm = a.lateChrgAm;
        this.msclnsAm = a.msclnsAm;
        this.adtnlAm = a.adtnlAm;
        this.prcpalAm = a.prcpalAm;
        this.prprtyTaxAm = a.prprtyTaxAm;
        this.othrAm = a.othrAm;
        this.mturtyTs = a.mturtyTs;
        this.toPdAm = a.toPdAm;
        this.dltPymntForTx = a.dltPymntForTx;
        this.pymntSrcCd = a.pymntSrcCd;
        this.adtOprtnCd = a.adtOprtnCd;
        this.adtStsCd = a.adtStsCd;
        this.adtRsnTx = a.adtRsnTx;
        this.jobKy = a.jobKy;
        this.jobNm = a.jobNm;
        this.adtTs = a.adtTs;
        this.crteTs = a.crteTs;
        this.crteUsrId = a.crteUsrId;
        this.updtTs = a.updtTs;
        this.updtUsrId = a.updtUsrId;



		return a;
	}

    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setId( Integer id )
    {
        this.id = id ;
    }
    public Integer getId()
    {
        return this.id;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : pymnt_hs_ky ( serial ) 
    public void setPymntHsKy( Integer pymntHsKy )
    {
        this.pymntHsKy = pymntHsKy;
    }
    public Integer getPymntHsKy()
    {
        return this.pymntHsKy;
    }

    //--- DATABASE MAPPING : usr_id ( varchar ) 
    public void setUsrId( String usrId )
    {
        this.usrId = usrId;
    }
    public String getUsrId()
    {
        return this.usrId;
    }

    //--- DATABASE MAPPING : fncl_acnt_id ( varchar ) 
    public void setFnclAcntId( String fnclAcntId )
    {
        this.fnclAcntId = fnclAcntId;
    }
    public String getFnclAcntId()
    {
        return this.fnclAcntId;
    }

    //--- DATABASE MAPPING : paye_ky ( numeric ) 
    public void setPayeKy( BigDecimal payeKy )
    {
        this.payeKy = payeKy;
    }
    public BigDecimal getPayeKy()
    {
        return this.payeKy;
    }

    //--- DATABASE MAPPING : pymnt_acnt_id ( varchar ) 
    public void setPymntAcntId( String pymntAcntId )
    {
        this.pymntAcntId = pymntAcntId;
    }
    public String getPymntAcntId()
    {
        return this.pymntAcntId;
    }

    //--- DATABASE MAPPING : pymnt_typ_nm ( varchar ) 
    public void setPymntTypNm( String pymntTypNm )
    {
        this.pymntTypNm = pymntTypNm;
    }
    public String getPymntTypNm()
    {
        return this.pymntTypNm;
    }

    //--- DATABASE MAPPING : pymnt_am ( numeric ) 
    public void setPymntAm( BigDecimal pymntAm )
    {
        this.pymntAm = pymntAm;
    }
    public BigDecimal getPymntAm()
    {
        return this.pymntAm;
    }

    //--- DATABASE MAPPING : am_typ_nm ( varchar ) 
    public void setAmTypNm( String amTypNm )
    {
        this.amTypNm = amTypNm;
    }
    public String getAmTypNm()
    {
        return this.amTypNm;
    }

    //--- DATABASE MAPPING : pymnt_intrvl_dy_nb ( numeric ) 
    public void setPymntIntrvlDyNb( BigDecimal pymntIntrvlDyNb )
    {
        this.pymntIntrvlDyNb = pymntIntrvlDyNb;
    }
    public BigDecimal getPymntIntrvlDyNb()
    {
        return this.pymntIntrvlDyNb;
    }

    //--- DATABASE MAPPING : pymnt_intrvl_mnth_nb ( numeric ) 
    public void setPymntIntrvlMnthNb( BigDecimal pymntIntrvlMnthNb )
    {
        this.pymntIntrvlMnthNb = pymntIntrvlMnthNb;
    }
    public BigDecimal getPymntIntrvlMnthNb()
    {
        return this.pymntIntrvlMnthNb;
    }

    //--- DATABASE MAPPING : pymnt_intrvl_tx ( varchar ) 
    public void setPymntIntrvlTx( String pymntIntrvlTx )
    {
        this.pymntIntrvlTx = pymntIntrvlTx;
    }
    public String getPymntIntrvlTx()
    {
        return this.pymntIntrvlTx;
    }

    //--- DATABASE MAPPING : strt_ts ( timestamp ) 
    public void setStrtTs( Date strtTs )
    {
        this.strtTs = strtTs;
    }
    public Date getStrtTs()
    {
        return this.strtTs;
    }

    //--- DATABASE MAPPING : end_ts ( timestamp ) 
    public void setEndTs( Date endTs )
    {
        this.endTs = endTs;
    }
    public Date getEndTs()
    {
        return this.endTs;
    }

    //--- DATABASE MAPPING : max_pymnt_nb ( numeric ) 
    public void setMaxPymntNb( BigDecimal maxPymntNb )
    {
        this.maxPymntNb = maxPymntNb;
    }
    public BigDecimal getMaxPymntNb()
    {
        return this.maxPymntNb;
    }

    //--- DATABASE MAPPING : crnt_pymnt_nb ( numeric ) 
    public void setCrntPymntNb( BigDecimal crntPymntNb )
    {
        this.crntPymntNb = crntPymntNb;
    }
    public BigDecimal getCrntPymntNb()
    {
        return this.crntPymntNb;
    }

    //--- DATABASE MAPPING : pymnt_sts_tx ( varchar ) 
    public void setPymntStsTx( String pymntStsTx )
    {
        this.pymntStsTx = pymntStsTx;
    }
    public String getPymntStsTx()
    {
        return this.pymntStsTx;
    }

    //--- DATABASE MAPPING : eml_in ( bpchar ) 
    public void setEmlIn( String emlIn )
    {
        this.emlIn = emlIn;
    }
    public String getEmlIn()
    {
        return this.emlIn;
    }

    //--- DATABASE MAPPING : bl_schdld_in ( bpchar ) 
    public void setBlSchdldIn( String blSchdldIn )
    {
        this.blSchdldIn = blSchdldIn;
    }
    public String getBlSchdldIn()
    {
        return this.blSchdldIn;
    }

    //--- DATABASE MAPPING : lst_prcs_ts ( timestamp ) 
    public void setLstPrcsTs( Date lstPrcsTs )
    {
        this.lstPrcsTs = lstPrcsTs;
    }
    public Date getLstPrcsTs()
    {
        return this.lstPrcsTs;
    }

    //--- DATABASE MAPPING : nxt_pymnt_ts ( timestamp ) 
    public void setNxtPymntTs( Date nxtPymntTs )
    {
        this.nxtPymntTs = nxtPymntTs;
    }
    public Date getNxtPymntTs()
    {
        return this.nxtPymntTs;
    }

    //--- DATABASE MAPPING : lst_pymnt_ts ( timestamp ) 
    public void setLstPymntTs( Date lstPymntTs )
    {
        this.lstPymntTs = lstPymntTs;
    }
    public Date getLstPymntTs()
    {
        return this.lstPymntTs;
    }

    //--- DATABASE MAPPING : flex_clmn1_tx ( varchar ) 
    public void setFlexClmn1Tx( String flexClmn1Tx )
    {
        this.flexClmn1Tx = flexClmn1Tx;
    }
    public String getFlexClmn1Tx()
    {
        return this.flexClmn1Tx;
    }

    //--- DATABASE MAPPING : flex_clmn2_tx ( varchar ) 
    public void setFlexClmn2Tx( String flexClmn2Tx )
    {
        this.flexClmn2Tx = flexClmn2Tx;
    }
    public String getFlexClmn2Tx()
    {
        return this.flexClmn2Tx;
    }

    //--- DATABASE MAPPING : pymnt_acnt_ky ( varchar ) 
    public void setPymntAcntKy( String pymntAcntKy )
    {
        this.pymntAcntKy = pymntAcntKy;
    }
    public String getPymntAcntKy()
    {
        return this.pymntAcntKy;
    }

    //--- DATABASE MAPPING : nxt_due_am ( numeric ) 
    public void setNxtDueAm( BigDecimal nxtDueAm )
    {
        this.nxtDueAm = nxtDueAm;
    }
    public BigDecimal getNxtDueAm()
    {
        return this.nxtDueAm;
    }

    //--- DATABASE MAPPING : late_chrg_am ( numeric ) 
    public void setLateChrgAm( BigDecimal lateChrgAm )
    {
        this.lateChrgAm = lateChrgAm;
    }
    public BigDecimal getLateChrgAm()
    {
        return this.lateChrgAm;
    }

    //--- DATABASE MAPPING : msclns_am ( numeric ) 
    public void setMsclnsAm( BigDecimal msclnsAm )
    {
        this.msclnsAm = msclnsAm;
    }
    public BigDecimal getMsclnsAm()
    {
        return this.msclnsAm;
    }

    //--- DATABASE MAPPING : adtnl_am ( numeric ) 
    public void setAdtnlAm( BigDecimal adtnlAm )
    {
        this.adtnlAm = adtnlAm;
    }
    public BigDecimal getAdtnlAm()
    {
        return this.adtnlAm;
    }

    //--- DATABASE MAPPING : prcpal_am ( numeric ) 
    public void setPrcpalAm( BigDecimal prcpalAm )
    {
        this.prcpalAm = prcpalAm;
    }
    public BigDecimal getPrcpalAm()
    {
        return this.prcpalAm;
    }

    //--- DATABASE MAPPING : prprty_tax_am ( numeric ) 
    public void setPrprtyTaxAm( BigDecimal prprtyTaxAm )
    {
        this.prprtyTaxAm = prprtyTaxAm;
    }
    public BigDecimal getPrprtyTaxAm()
    {
        return this.prprtyTaxAm;
    }

    //--- DATABASE MAPPING : othr_am ( numeric ) 
    public void setOthrAm( BigDecimal othrAm )
    {
        this.othrAm = othrAm;
    }
    public BigDecimal getOthrAm()
    {
        return this.othrAm;
    }

    //--- DATABASE MAPPING : mturty_ts ( timestamp ) 
    public void setMturtyTs( Date mturtyTs )
    {
        this.mturtyTs = mturtyTs;
    }
    public Date getMturtyTs()
    {
        return this.mturtyTs;
    }

    //--- DATABASE MAPPING : to_pd_am ( numeric ) 
    public void setToPdAm( BigDecimal toPdAm )
    {
        this.toPdAm = toPdAm;
    }
    public BigDecimal getToPdAm()
    {
        return this.toPdAm;
    }

    //--- DATABASE MAPPING : dlt_pymnt_for_tx ( varchar ) 
    public void setDltPymntForTx( String dltPymntForTx )
    {
        this.dltPymntForTx = dltPymntForTx;
    }
    public String getDltPymntForTx()
    {
        return this.dltPymntForTx;
    }

    //--- DATABASE MAPPING : pymnt_src_cd ( bpchar ) 
    public void setPymntSrcCd( String pymntSrcCd )
    {
        this.pymntSrcCd = pymntSrcCd;
    }
    public String getPymntSrcCd()
    {
        return this.pymntSrcCd;
    }

    //--- DATABASE MAPPING : adt_oprtn_cd ( numeric ) 
    public void setAdtOprtnCd( BigDecimal adtOprtnCd )
    {
        this.adtOprtnCd = adtOprtnCd;
    }
    public BigDecimal getAdtOprtnCd()
    {
        return this.adtOprtnCd;
    }

    //--- DATABASE MAPPING : adt_sts_cd ( numeric ) 
    public void setAdtStsCd( BigDecimal adtStsCd )
    {
        this.adtStsCd = adtStsCd;
    }
    public BigDecimal getAdtStsCd()
    {
        return this.adtStsCd;
    }

    //--- DATABASE MAPPING : adt_rsn_tx ( varchar ) 
    public void setAdtRsnTx( String adtRsnTx )
    {
        this.adtRsnTx = adtRsnTx;
    }
    public String getAdtRsnTx()
    {
        return this.adtRsnTx;
    }

    //--- DATABASE MAPPING : job_ky ( numeric ) 
    public void setJobKy( BigDecimal jobKy )
    {
        this.jobKy = jobKy;
    }
    public BigDecimal getJobKy()
    {
        return this.jobKy;
    }

    //--- DATABASE MAPPING : job_nm ( varchar ) 
    public void setJobNm( String jobNm )
    {
        this.jobNm = jobNm;
    }
    public String getJobNm()
    {
        return this.jobNm;
    }

    //--- DATABASE MAPPING : adt_ts ( timestamp ) 
    public void setAdtTs( Date adtTs )
    {
        this.adtTs = adtTs;
    }
    public Date getAdtTs()
    {
        return this.adtTs;
    }

    //--- DATABASE MAPPING : crte_ts ( timestamp ) 
    public void setCrteTs( Date crteTs )
    {
        this.crteTs = crteTs;
    }
    public Date getCrteTs()
    {
        return this.crteTs;
    }

    //--- DATABASE MAPPING : crte_usr_id ( varchar ) 
    public void setCrteUsrId( String crteUsrId )
    {
        this.crteUsrId = crteUsrId;
    }
    public String getCrteUsrId()
    {
        return this.crteUsrId;
    }

    //--- DATABASE MAPPING : updt_ts ( timestamp ) 
    public void setUpdtTs( Date updtTs )
    {
        this.updtTs = updtTs;
    }
    public Date getUpdtTs()
    {
        return this.updtTs;
    }

    //--- DATABASE MAPPING : updt_usr_id ( varchar ) 
    public void setUpdtUsrId( String updtUsrId )
    {
        this.updtUsrId = updtUsrId;
    }
    public String getUpdtUsrId()
    {
        return this.updtUsrId;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(pymntHsKy);
        sb.append("|");
        sb.append(usrId);
        sb.append("|");
        sb.append(fnclAcntId);
        sb.append("|");
        sb.append(payeKy);
        sb.append("|");
        sb.append(pymntAcntId);
        sb.append("|");
        sb.append(pymntTypNm);
        sb.append("|");
        sb.append(pymntAm);
        sb.append("|");
        sb.append(amTypNm);
        sb.append("|");
        sb.append(pymntIntrvlDyNb);
        sb.append("|");
        sb.append(pymntIntrvlMnthNb);
        sb.append("|");
        sb.append(pymntIntrvlTx);
        sb.append("|");
        sb.append(strtTs);
        sb.append("|");
        sb.append(endTs);
        sb.append("|");
        sb.append(maxPymntNb);
        sb.append("|");
        sb.append(crntPymntNb);
        sb.append("|");
        sb.append(pymntStsTx);
        sb.append("|");
        sb.append(emlIn);
        sb.append("|");
        sb.append(blSchdldIn);
        sb.append("|");
        sb.append(lstPrcsTs);
        sb.append("|");
        sb.append(nxtPymntTs);
        sb.append("|");
        sb.append(lstPymntTs);
        sb.append("|");
        sb.append(flexClmn1Tx);
        sb.append("|");
        sb.append(flexClmn2Tx);
        sb.append("|");
        sb.append(pymntAcntKy);
        sb.append("|");
        sb.append(nxtDueAm);
        sb.append("|");
        sb.append(lateChrgAm);
        sb.append("|");
        sb.append(msclnsAm);
        sb.append("|");
        sb.append(adtnlAm);
        sb.append("|");
        sb.append(prcpalAm);
        sb.append("|");
        sb.append(prprtyTaxAm);
        sb.append("|");
        sb.append(othrAm);
        sb.append("|");
        sb.append(mturtyTs);
        sb.append("|");
        sb.append(toPdAm);
        sb.append("|");
        sb.append(dltPymntForTx);
        sb.append("|");
        sb.append(pymntSrcCd);
        sb.append("|");
        sb.append(adtOprtnCd);
        sb.append("|");
        sb.append(adtStsCd);
        sb.append("|");
        sb.append(adtRsnTx);
        sb.append("|");
        sb.append(jobKy);
        sb.append("|");
        sb.append(jobNm);
        sb.append("|");
        sb.append(adtTs);
        sb.append("|");
        sb.append(crteTs);
        sb.append("|");
        sb.append(crteUsrId);
        sb.append("|");
        sb.append(updtTs);
        sb.append("|");
        sb.append(updtUsrId);
        return sb.toString(); 
    } 

}