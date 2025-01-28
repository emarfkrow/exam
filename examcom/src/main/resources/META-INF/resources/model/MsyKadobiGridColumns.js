/**
 * 稼働日マスタグリッド定義
 */

let MsyKadobiGridColumns = [];

$(function() {
    MsyKadobiGridColumns = [
        Column.date('KADO_BI', Messages['MsyKadobiGrid.kadoBi'], 80, 'primaryKey', Slick.Formatters.Extends.Date),
        Column.select('BUSHO_KB', Messages['MsyKadobiGrid.bushoKb'], 30, 'primaryKey', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
        Column.check('KADOBI_F', Messages['MsyKadobiGrid.kadobiF'], 30, 'notblank'),
        Column.text('MEMO', Messages['MsyKadobiGrid.memo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['MsyKadobiGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['MsyKadobiGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['MsyKadobiGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
