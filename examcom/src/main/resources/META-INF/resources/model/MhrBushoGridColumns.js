/**
 * 部署マスタグリッド定義
 */

let MhrBushoGridColumns = [
    Column.comma('BUSHO_ID', Messages['MhrBushoGrid.bushoId'], 80, 'primaryKey numbering', null),
    Column.text('BUSHO_MEI', Messages['MhrBushoGrid.bushoMei'], 300, 'notblank', null),
    Column.refer('OYA_BUSHO_ID', Messages['MhrBushoGrid.oyaBushoId'], 80, '', 'OYA_BUSHO_MEI'),
    Column.date('KAISHI_BI', Messages['MhrBushoGrid.kaishiBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.date('SHURYO_BI', Messages['MhrBushoGrid.shuryoBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.cell('UPDATE_TS', Messages['MhrBushoGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.check('DELETE_F', Messages['MhrBushoGrid.deleteF'], 30, ''),
    Column.select('STATUS_KB', Messages['MhrBushoGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
];
