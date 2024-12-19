/**
 * VIEWグリッド定義
 */

let Vb2EntityGridColumns = [
    Column.refer('ENTITY_ID', Messages['Vb2EntityGrid.entityId'], 80, 'notblank', 'null'),
    Column.text('ENTITY_NM', Messages['Vb2EntityGrid.entityNm'], 240, 'notblank', null),
    Column.text('ENTITY_MEI', Messages['Vb2EntityGrid.entityMei'], 300, 'notblank', null),
    Column.check('CHECK_F', Messages['Vb2EntityGrid.checkF'], 30, 'notblank'),
    Column.select('RADIO_KB', Messages['Vb2EntityGrid.radioKb'], 30, 'notblank', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    Column.select('PULLDOWN_KB', Messages['Vb2EntityGrid.pulldownKb'], 30, 'notblank', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    Column.longText('MEMO_TX', Messages['Vb2EntityGrid.memoTx'], 300, 'notblank', null),
    Column.text('NEN_Y', Messages['Vb2EntityGrid.nenY'], 32, 'notblank', null),
    Column.text('TSUKI_M', Messages['Vb2EntityGrid.tsukiM'], 30, 'notblank', null),
    Column.text('HI_D', Messages['Vb2EntityGrid.hiD'], 30, 'notblank', null),
    Column.month('NENGETSU_YM', Messages['Vb2EntityGrid.nengetsuYm'], 48, 'notblank', null),
    Column.date8('NENGAPPI_YMD', Messages['Vb2EntityGrid.nengappiYmd'], 64, 'notblank', null),
    Column.text('TIMESTAMP_TS', Messages['Vb2EntityGrid.timestampTs'], 184, 'notblank', Slick.Formatters.Extends.Timestamp),
    Column.dateTime('NICHIJI_DT', Messages['Vb2EntityGrid.nichijiDt'], 152, 'notblank'),
    Column.date('HIDUKE_BI', Messages['Vb2EntityGrid.hidukeBi'], 80, 'notblank', Slick.Formatters.Extends.Date),
    Column.time('JIKOKU_HM', Messages['Vb2EntityGrid.jikokuHm'], 40, 'notblank', null),
    Column.text('JIKAN_TM', Messages['Vb2EntityGrid.jikanTm'], 72, 'notblank', null),
    Column.dec2('SURYO_QT', Messages['Vb2EntityGrid.suryoQt'], 72, 'notblank', null),
    Column.dec3('TANKA_KG', Messages['Vb2EntityGrid.tankaKg'], 88, 'notblank', null),
    Column.dec3('ZEINUKI_KG', Messages['Vb2EntityGrid.zeinukiKg'], 88, 'notblank', null),
];
