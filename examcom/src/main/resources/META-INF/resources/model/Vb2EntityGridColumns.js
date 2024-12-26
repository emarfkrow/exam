/**
 * VIEWグリッド定義
 */

let Vb2EntityGridColumns = [
    Column.refer('ENTITY_ID', Messages['Vb2EntityGrid.entityId'], 80, '', 'ENTITY_MEI'),
    Column.cell('ENTITY_NM', Messages['Vb2EntityGrid.entityNm'], 160, '', null),
    Column.cell('ENTITY_MEI', Messages['Vb2EntityGrid.entityMei'], 300, '', null),
    Column.cell('CHECK_F', Messages['Vb2EntityGrid.checkF'], 30, '', null),
    Column.cell('RADIO_KB', Messages['Vb2EntityGrid.radioKb'], 30, '', null),
    Column.cell('PULLDOWN_KB', Messages['Vb2EntityGrid.pulldownKb'], 30, '', null),
    Column.cell('MEMO_TX', Messages['Vb2EntityGrid.memoTx'], 300, '', null),
    Column.cell('NEN_Y', Messages['Vb2EntityGrid.nenY'], 32, '', null),
    Column.cell('TSUKI_M', Messages['Vb2EntityGrid.tsukiM'], 30, '', null),
    Column.cell('HI_D', Messages['Vb2EntityGrid.hiD'], 30, '', null),
    Column.cell('NENGETSU_YM', Messages['Vb2EntityGrid.nengetsuYm'], 48, '', null),
    Column.cell('NENGAPPI_YMD', Messages['Vb2EntityGrid.nengappiYmd'], 64, '', null),
    Column.cell('TIMESTAMP_TS', Messages['Vb2EntityGrid.timestampTs'], 184, '', Slick.Formatters.Extends.Timestamp),
    Column.cell('NICHIJI_DT', Messages['Vb2EntityGrid.nichijiDt'], 152, '', Slick.Formatters.Extends.DateTime),
    Column.cell('HIDUKE_BI', Messages['Vb2EntityGrid.hidukeBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.cell('JIKOKU_HM', Messages['Vb2EntityGrid.jikokuHm'], 40, '', null),
    Column.cell('JIKAN_TM', Messages['Vb2EntityGrid.jikanTm'], 72, '', null),
    Column.cell('SURYO_QT', Messages['Vb2EntityGrid.suryoQt'], 72, '', null),
    Column.cell('TANKA_KG', Messages['Vb2EntityGrid.tankaKg'], 88, '', null),
    Column.cell('ZEINUKI_KG', Messages['Vb2EntityGrid.zeinukiKg'], 88, '', null),
];
