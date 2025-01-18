/**
 * エンティティグリッド定義
 */

let Tb2EntityGridColumns = [];

$(function() {
    Tb2EntityGridColumns = [
        Column.comma('ENTITY_ID', Messages['Tb2EntityGrid.entityId'], 80, 'primaryKey numbering', null),
        Column.text('ENTITY_NM', Messages['Tb2EntityGrid.entityNm'], 160, 'notblank', null),
        Column.text('ENTITY_MEI', Messages['Tb2EntityGrid.entityMei'], 300, 'notblank', null),
        Column.check('CHECK_F', Messages['Tb2EntityGrid.checkF'], 30, 'notblank'),
        Column.select('RADIO_KB', Messages['Tb2EntityGrid.radioKb'], 30, 'notblank', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
        Column.select('PULLDOWN_KB', Messages['Tb2EntityGrid.pulldownKb'], 30, 'notblank', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
        Column.text('PULLDOWN_SB', Messages['Tb2EntityGrid.pulldownSb'], 30, 'notblank', null),
        Column.longText('MEMO_TX', Messages['Tb2EntityGrid.memoTx'], 300, 'notblank', null),
        Column.text('MEMO', Messages['Tb2EntityGrid.memo'], 300, 'notblank', null),
        Column.link('FILE_PATH', Messages['Tb2EntityGrid.filePath'], 300, 'notblank'),
        Column.text('NEN_Y', Messages['Tb2EntityGrid.nenY'], 32, 'notblank', null),
        Column.text('TSUKI_M', Messages['Tb2EntityGrid.tsukiM'], 30, 'notblank', null),
        Column.text('HI_D', Messages['Tb2EntityGrid.hiD'], 30, 'notblank', null),
        Column.month('NENGETSU_YM', Messages['Tb2EntityGrid.nengetsuYm'], 48, 'notblank', null),
        Column.date8('NENGAPPI_YMD', Messages['Tb2EntityGrid.nengappiYmd'], 64, 'notblank', null),
        Column.text('TIMESTAMP_TS', Messages['Tb2EntityGrid.timestampTs'], 184, 'notblank', Slick.Formatters.Extends.Timestamp),
        Column.dateTime('NICHIJI_DT', Messages['Tb2EntityGrid.nichijiDt'], 152, 'notblank'),
        Column.date('HIDUKE_BI', Messages['Tb2EntityGrid.hidukeBi'], 80, 'notblank', Slick.Formatters.Extends.Date),
        Column.time('JIKOKU_HM', Messages['Tb2EntityGrid.jikokuHm'], 40, 'notblank', null),
        Column.text('JIKAN_TM', Messages['Tb2EntityGrid.jikanTm'], 72, 'notblank', null),
        Column.dec3('SURYO_QT', Messages['Tb2EntityGrid.suryoQt'], 88, 'notblank', null),
        Column.dec2('TANKA_PR', Messages['Tb2EntityGrid.tankaPr'], 88, 'notblank', null),
        Column.select('TSUKA_KB', Messages['Tb2EntityGrid.tsukaKb'], 30, 'notblank', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
        Column.dec2('ZEINUKI_AM', Messages['Tb2EntityGrid.zeinukiAm'], 88, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Tb2EntityGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb2EntityGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb2EntityGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
