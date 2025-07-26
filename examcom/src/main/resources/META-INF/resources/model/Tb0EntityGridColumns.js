/**
 * エンティティグリッド定義
 */

let Tb0EntityGridColumns = [];

$(function() {
    Tb0EntityGridColumns = [
        Column.text('ENTITY_ID', Messages['Tb0EntityGrid.entityId'], 90, 'primaryKey numbering', null),
        Column.text('ENTITY_NM', Messages['Tb0EntityGrid.entityNm'], 180, 'notblank', null),
        Column.text('ENTITY_MEI', Messages['Tb0EntityGrid.entityMei'], 300, 'notblank', null),
        Column.check('CHECK_F', Messages['Tb0EntityGrid.checkF'], 30, 'notblank'),
        Column.select('RADIO_KB', Messages['Tb0EntityGrid.radioKb'], 30, 'notblank', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
        Column.select('PULLDOWN_KB', Messages['Tb0EntityGrid.pulldownKb'], 30, 'notblank', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
        Column.select('PULLDOWN_SB', Messages['Tb0EntityGrid.pulldownSb'], 30, 'notblank', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
        Column.longText('MEMO_TX', Messages['Tb0EntityGrid.memoTx'], 300, 'notblank', null),
        Column.text('MEMO', Messages['Tb0EntityGrid.memo'], 300, 'notblank', null),
        Column.link('TENPU_FILE', Messages['Tb0EntityGrid.tenpuFile'], 300, 'notblank'),
        Column.text('NEN_Y', Messages['Tb0EntityGrid.nenY'], 36, 'notblank', null),
        Column.text('TSUKI_M', Messages['Tb0EntityGrid.tsukiM'], 30, 'notblank', null),
        Column.text('HI_D', Messages['Tb0EntityGrid.hiD'], 30, 'notblank', null),
        Column.month('NENGETSU_YM', Messages['Tb0EntityGrid.nengetsuYm'], 54, 'notblank', Slick.Formatters.Extends.Month),
        Column.date8('NENGAPPI_YMD', Messages['Tb0EntityGrid.nengappiYmd'], 72, 'notblank', null),
        Column.cell('TIMESTAMP_TS', Messages['Tb0EntityGrid.timestampTs'], 207, 'notblank', Slick.Formatters.Extends.Timestamp),
        Column.dateTime('NICHIJI_DT', Messages['Tb0EntityGrid.nichijiDt'], 171, 'notblank'),
        Column.date('HIDUKE_BI', Messages['Tb0EntityGrid.hidukeBi'], 90, 'notblank', Slick.Formatters.Extends.Date),
        Column.time('JIKOKU_HM', Messages['Tb0EntityGrid.jikokuHm'], 45, 'notblank', null),
        Column.text('JIKAN_TM', Messages['Tb0EntityGrid.jikanTm'], 81, 'notblank', null),
        Column.dec3('SURYO_QT', Messages['Tb0EntityGrid.suryoQt'], 99, 'notblank', null),
        Column.dec2('TANKA_PR', Messages['Tb0EntityGrid.tankaPr'], 99, 'notblank', null),
        Column.select('TSUKA_KB', Messages['Tb0EntityGrid.tsukaKb'], 30, 'notblank', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
        Column.dec2('ZEINUKI_AM', Messages['Tb0EntityGrid.zeinukiAm'], 99, 'notblank', null),
        Column.check('DELETE_F', Messages['Tb0EntityGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb0EntityGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
        Column.cell('UPDATE_TS', Messages['Tb0EntityGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
