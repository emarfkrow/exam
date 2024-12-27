/**
 * 区分値マスタグリッド定義
 */

let MsyKbnValGridColumns = [
    Column.refer('KBN_NM', Messages['MsyKbnValGrid.kbnNm'], 160, 'primaryKey', 'KBN_MEI'),
    Column.text('KBN_VAL', Messages['MsyKbnValGrid.kbnVal'], 30, 'primaryKey', null),
    Column.text('KBN_VAL_MEI', Messages['MsyKbnValGrid.kbnValMei'], 300, 'notblank', null),
    Column.comma('HYOJI_ON', Messages['MsyKbnValGrid.hyojiOn'], 80, '', null),
    Column.text('CRITERIA', Messages['MsyKbnValGrid.criteria'], 300, '', null),
    Column.cell('UPDATE_TS', Messages['MsyKbnValGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.check('DELETE_F', Messages['MsyKbnValGrid.deleteF'], 30, ''),
    Column.select('STATUS_KB', Messages['MsyKbnValGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
];
